//�滻���һ������
function replceLastDH(str){
	str=(str.substring(str.length-1)==',')?str.substring(0,str.length-1):str;
	return str;
}
//去除所有空格
function Trim(str,is_global)
{
 var result;
 result = str.replace(/(^\s+)|(\s+$)/g,"");
 if(is_global.toLowerCase()=="g")
 {
  result = result.replace(/\s/g,"");
  }
 return result;
}

//去除两边空格
//去除空格
function Trim(s){
  return s.replace(/(^\s*)|(\s*$)/g, "");
}

