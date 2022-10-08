/* eslint-disable @typescript-eslint/no-explicit-any */
/* eslint-disable @typescript-eslint/ban-types */

export interface AtEditorConfig {
  id: string; // iframe id
  systemId: string;
  clientBaseUrl: string;
  page: "structtext" | "cases";
  userId: string;
  userName: string;
  patientId?: string; // cases page required
  patientName?: string; // cases page required
  debug?: boolean;
  [key: string]: any;
}

export interface AtEditorEventMap {
  /** @deprecated use SaveCase instead */
  Save(): { tempSeq: string; caseSeq: string; hasSignCa: boolean; isSigned: boolean; contentHtml: string };
  SaveCase(): { tempSeq: string; caseSeq: string; hasSignCa: boolean; isSigned: boolean; contentHtml: string };
  OverwriteSettings(payload: { showEditorToolbar?: boolean; showCaseHistoryList?: boolean; showCaseTemplateTree?: boolean; printerList?: { code: string; name: string }[]; paperList?: { code: string; name: string }[] }): {};
  InsertCase(payload: string): { caseSeq: string; tempSeq: string; response: any };
  InsertCaseTemplate(payload: string): { tempSeq: string; response: any };
  GetPreviewHtml(): { html: string };
  Sign(payload: { imageBase64: string; targetSelector?: string; autoSave?: boolean; overwrite?: boolean }): { isSaved: boolean; isSigned: boolean };
  Print(): {};
  GetComponentById(payload: { id: string }): { component: any; value: string };
  SetComponentValueById(payload: { id: string; value: string }): {};
}

type PayloadType<F> = F extends (arg: infer FirstArg) => any ? FirstArg : never;
type ReturnType<F> = F extends (...args: any[]) => infer R ? R : never;
type MappedEvent<T, K> = K extends keyof T ? T[K] : never;
interface AtEditorEvent<F> extends Event {
  data: ({ status: "success" } & ReturnType<F>) | { status: "error"; error: string };
}

interface AtEditorEventDispatcher<T> {
  dispatch<K extends keyof T, F extends MappedEvent<T, K>>(type: K, payload: PayloadType<F>): void;
  dispatch<K extends keyof T, F extends MappedEvent<T, K>>(message: { type: K; payload: PayloadType<F> }): void;
  on<K extends keyof T, F extends MappedEvent<T, K>>(name: K, callback: (event: AtEditorEvent<F>) => void): void;
  off<K extends keyof T, F extends MappedEvent<T, K>>(name?: K, callback?: (event: AtEditorEvent<F>) => void): void;
  once<K extends keyof T, F extends MappedEvent<T, K>>(name: K, callback: (event: AtEditorEvent<F>) => void): void;
}

declare global {
  export interface AtEditorFrame extends AtEditorEventDispatcher<AtEditorEventMap> {
    unsubscribe(): void;
  }

  interface Window {
    atEditorConfig: Partial<AtEditorConfig>;
    defineEditorFrame(config: Partial<AtEditorConfig>): AtEditorFrame;
  }
}