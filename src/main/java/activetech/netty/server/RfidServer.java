package activetech.netty.server;

import activetech.netty.handler.RfidHandler;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.codec.string.StringDecoder;
import io.netty.handler.codec.string.StringEncoder;
import io.netty.handler.logging.LogLevel;
import io.netty.handler.logging.LoggingHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;

@Component
public class RfidServer extends Thread {

    private int port;

    public RfidServer(int port) {
        this.port = port;
    }

    private static final Logger LOGGER = LoggerFactory.getLogger(RfidServer.class);

    //来接收客户端传进来的连接
    NioEventLoopGroup bossGroup = new NioEventLoopGroup();
    //来处理已被接收的连接
    NioEventLoopGroup workerGroup = new NioEventLoopGroup();
    //创建 netty 服务
    ServerBootstrap serverBootstrap = new ServerBootstrap();

    @Override
    public void run() {
        serverBootstrap.group(bossGroup, workerGroup)
                //设置 NIO 模式
                .channel(NioServerSocketChannel.class)
                //设置 tcp 缓冲区
                .option(ChannelOption.SO_BACKLOG,100)
                //设置发送缓冲区数据大小
                .childOption(ChannelOption.SO_SNDBUF,8 * 100)
                //设置接收缓冲区数据大小
                .option(ChannelOption.SO_RCVBUF,8 * 100)
                //保持长连接
                .childOption(ChannelOption.SO_KEEPALIVE, true)
                .handler(new LoggingHandler(LogLevel.INFO))
                .childHandler(new ChannelInitializer<SocketChannel>() {

                    @Override
                    protected void initChannel(SocketChannel ch) {
                        ChannelPipeline pipeline = ch.pipeline();
                        // StringDecoder：字符串解码器，将Channel中的ByteBuf数据解码为String
                        pipeline.addLast(new StringDecoder());
                        // tringEncoder：字符串编码器，将String编码为将要发送到Channel中的ByteBuf
                        pipeline.addLast(new StringEncoder());
                        // 通道的初始化，数据传输过来进行拦截及执行
                        pipeline.addLast(new RfidHandler());
                    }
                });
        //绑定端口启动服务
        ChannelFuture channelFuture = null;
        try {
            //端口号放入
            channelFuture = serverBootstrap.bind(port).sync();
            channelFuture.channel().closeFuture().sync();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            //关闭
            close();
        }
    }

    @PreDestroy
    public void close() {
        workerGroup.shutdownGracefully();
        bossGroup.shutdownGracefully();
        LOGGER.info("RfidServer关闭服务器");
    }
}