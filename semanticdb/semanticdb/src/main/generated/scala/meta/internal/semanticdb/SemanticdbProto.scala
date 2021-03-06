// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package scala.meta.internal.semanticdb

object SemanticdbProto extends _root_.scalapb.GeneratedFileObject {
  lazy val dependencies: Seq[_root_.scalapb.GeneratedFileObject] = Seq(
  )
  lazy val messagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_]] = Seq(
    scala.meta.internal.semanticdb.TextDocuments,
    scala.meta.internal.semanticdb.TextDocument,
    scala.meta.internal.semanticdb.Range,
    scala.meta.internal.semanticdb.Location,
    scala.meta.internal.semanticdb.Scope,
    scala.meta.internal.semanticdb.TypeMessage,
    scala.meta.internal.semanticdb.TypeRef,
    scala.meta.internal.semanticdb.SingleType,
    scala.meta.internal.semanticdb.ThisType,
    scala.meta.internal.semanticdb.SuperType,
    scala.meta.internal.semanticdb.ConstantType,
    scala.meta.internal.semanticdb.IntersectionType,
    scala.meta.internal.semanticdb.UnionType,
    scala.meta.internal.semanticdb.WithType,
    scala.meta.internal.semanticdb.StructuralType,
    scala.meta.internal.semanticdb.AnnotatedType,
    scala.meta.internal.semanticdb.ExistentialType,
    scala.meta.internal.semanticdb.UniversalType,
    scala.meta.internal.semanticdb.ByNameType,
    scala.meta.internal.semanticdb.RepeatedType,
    scala.meta.internal.semanticdb.ConstantMessage,
    scala.meta.internal.semanticdb.UnitConstant,
    scala.meta.internal.semanticdb.BooleanConstant,
    scala.meta.internal.semanticdb.ByteConstant,
    scala.meta.internal.semanticdb.ShortConstant,
    scala.meta.internal.semanticdb.CharConstant,
    scala.meta.internal.semanticdb.IntConstant,
    scala.meta.internal.semanticdb.LongConstant,
    scala.meta.internal.semanticdb.FloatConstant,
    scala.meta.internal.semanticdb.DoubleConstant,
    scala.meta.internal.semanticdb.StringConstant,
    scala.meta.internal.semanticdb.NullConstant,
    scala.meta.internal.semanticdb.SignatureMessage,
    scala.meta.internal.semanticdb.ClassSignature,
    scala.meta.internal.semanticdb.MethodSignature,
    scala.meta.internal.semanticdb.TypeSignature,
    scala.meta.internal.semanticdb.ValueSignature,
    scala.meta.internal.semanticdb.SymbolInformation,
    scala.meta.internal.semanticdb.Annotation,
    scala.meta.internal.semanticdb.Accessibility,
    scala.meta.internal.semanticdb.SymbolOccurrence,
    scala.meta.internal.semanticdb.Diagnostic,
    scala.meta.internal.semanticdb.Synthetic,
    scala.meta.internal.semanticdb.TreeMessage,
    scala.meta.internal.semanticdb.ApplyTree,
    scala.meta.internal.semanticdb.FunctionTree,
    scala.meta.internal.semanticdb.IdTree,
    scala.meta.internal.semanticdb.LiteralTree,
    scala.meta.internal.semanticdb.MacroExpansionTree,
    scala.meta.internal.semanticdb.OriginalTree,
    scala.meta.internal.semanticdb.SelectTree,
    scala.meta.internal.semanticdb.TypeApplyTree
  )
  private lazy val ProtoBytes: Array[Byte] =
      scalapb.Encoding.fromBase64(scala.collection.Seq(
  """CiZzZW1hbnRpY2RiL3NlbWFudGljZGIvc2VtYW50aWNkYi5wcm90bxIec2NhbGEubWV0YS5pbnRlcm5hbC5zZW1hbnRpY2RiI
  lsKDVRleHREb2N1bWVudHMSSgoJZG9jdW1lbnRzGAEgAygLMiwuc2NhbGEubWV0YS5pbnRlcm5hbC5zZW1hbnRpY2RiLlRleHREb
  2N1bWVudFIJZG9jdW1lbnRzIpgECgxUZXh0RG9jdW1lbnQSPgoGc2NoZW1hGAEgASgOMiYuc2NhbGEubWV0YS5pbnRlcm5hbC5zZ
  W1hbnRpY2RiLlNjaGVtYVIGc2NoZW1hEhAKA3VyaRgCIAEoCVIDdXJpEhIKBHRleHQYAyABKAlSBHRleHQSEAoDbWQ1GAsgASgJU
  gNtZDUSRAoIbGFuZ3VhZ2UYCiABKA4yKC5zY2FsYS5tZXRhLmludGVybmFsLnNlbWFudGljZGIuTGFuZ3VhZ2VSCGxhbmd1YWdlE
  ksKB3N5bWJvbHMYBSADKAsyMS5zY2FsYS5tZXRhLmludGVybmFsLnNlbWFudGljZGIuU3ltYm9sSW5mb3JtYXRpb25SB3N5bWJvb
  HMSUgoLb2NjdXJyZW5jZXMYBiADKAsyMC5zY2FsYS5tZXRhLmludGVybmFsLnNlbWFudGljZGIuU3ltYm9sT2NjdXJyZW5jZVILb
  2NjdXJyZW5jZXMSTAoLZGlhZ25vc3RpY3MYByADKAsyKi5zY2FsYS5tZXRhLmludGVybmFsLnNlbWFudGljZGIuRGlhZ25vc3RpY
  1ILZGlhZ25vc3RpY3MSSQoKc3ludGhldGljcxgMIAMoCzIpLnNjYWxhLm1ldGEuaW50ZXJuYWwuc2VtYW50aWNkYi5TeW50aGV0a
  WNSCnN5bnRoZXRpY3NKBAgEEAVKBAgIEAlKBAgJEAoijwEKBVJhbmdlEh0KCnN0YXJ0X2xpbmUYASABKAVSCXN0YXJ0TGluZRInC
  g9zdGFydF9jaGFyYWN0ZXIYAiABKAVSDnN0YXJ0Q2hhcmFjdGVyEhkKCGVuZF9saW5lGAMgASgFUgdlbmRMaW5lEiMKDWVuZF9ja
  GFyYWN0ZXIYBCABKAVSDGVuZENoYXJhY3RlciJZCghMb2NhdGlvbhIQCgN1cmkYASABKAlSA3VyaRI7CgVyYW5nZRgCIAEoCzIlL
  nNjYWxhLm1ldGEuaW50ZXJuYWwuc2VtYW50aWNkYi5SYW5nZVIFcmFuZ2UidAoFU2NvcGUSGgoIc3ltbGlua3MYASADKAlSCHN5b
  WxpbmtzEk8KCWhhcmRsaW5rcxgCIAMoCzIxLnNjYWxhLm1ldGEuaW50ZXJuYWwuc2VtYW50aWNkYi5TeW1ib2xJbmZvcm1hdGlvb
  lIJaGFyZGxpbmtzIsAJCgRUeXBlEkMKB3R5cGVSZWYYAiABKAsyJy5zY2FsYS5tZXRhLmludGVybmFsLnNlbWFudGljZGIuVHlwZ
  VJlZkgAUgd0eXBlUmVmEkwKCnNpbmdsZVR5cGUYFCABKAsyKi5zY2FsYS5tZXRhLmludGVybmFsLnNlbWFudGljZGIuU2luZ2xlV
  HlwZUgAUgpzaW5nbGVUeXBlEkYKCHRoaXNUeXBlGBUgASgLMiguc2NhbGEubWV0YS5pbnRlcm5hbC5zZW1hbnRpY2RiLlRoaXNUe
  XBlSABSCHRoaXNUeXBlEkkKCXN1cGVyVHlwZRgWIAEoCzIpLnNjYWxhLm1ldGEuaW50ZXJuYWwuc2VtYW50aWNkYi5TdXBlclR5c
  GVIAFIJc3VwZXJUeXBlElIKDGNvbnN0YW50VHlwZRgXIAEoCzIsLnNjYWxhLm1ldGEuaW50ZXJuYWwuc2VtYW50aWNkYi5Db25zd
  GFudFR5cGVIAFIMY29uc3RhbnRUeXBlEl4KEGludGVyc2VjdGlvblR5cGUYESABKAsyMC5zY2FsYS5tZXRhLmludGVybmFsLnNlb
  WFudGljZGIuSW50ZXJzZWN0aW9uVHlwZUgAUhBpbnRlcnNlY3Rpb25UeXBlEkkKCXVuaW9uVHlwZRgSIAEoCzIpLnNjYWxhLm1ld
  GEuaW50ZXJuYWwuc2VtYW50aWNkYi5VbmlvblR5cGVIAFIJdW5pb25UeXBlEkYKCHdpdGhUeXBlGBMgASgLMiguc2NhbGEubWV0Y
  S5pbnRlcm5hbC5zZW1hbnRpY2RiLldpdGhUeXBlSABSCHdpdGhUeXBlElgKDnN0cnVjdHVyYWxUeXBlGAcgASgLMi4uc2NhbGEub
  WV0YS5pbnRlcm5hbC5zZW1hbnRpY2RiLlN0cnVjdHVyYWxUeXBlSABSDnN0cnVjdHVyYWxUeXBlElUKDWFubm90YXRlZFR5cGUYC
  CABKAsyLS5zY2FsYS5tZXRhLmludGVybmFsLnNlbWFudGljZGIuQW5ub3RhdGVkVHlwZUgAUg1hbm5vdGF0ZWRUeXBlElsKD2V4a
  XN0ZW50aWFsVHlwZRgJIAEoCzIvLnNjYWxhLm1ldGEuaW50ZXJuYWwuc2VtYW50aWNkYi5FeGlzdGVudGlhbFR5cGVIAFIPZXhpc
  3RlbnRpYWxUeXBlElUKDXVuaXZlcnNhbFR5cGUYCiABKAsyLS5zY2FsYS5tZXRhLmludGVybmFsLnNlbWFudGljZGIuVW5pdmVyc
  2FsVHlwZUgAUg11bml2ZXJzYWxUeXBlEkwKCmJ5TmFtZVR5cGUYDSABKAsyKi5zY2FsYS5tZXRhLmludGVybmFsLnNlbWFudGljZ
  GIuQnlOYW1lVHlwZUgAUgpieU5hbWVUeXBlElIKDHJlcGVhdGVkVHlwZRgOIAEoCzIsLnNjYWxhLm1ldGEuaW50ZXJuYWwuc2VtY
  W50aWNkYi5SZXBlYXRlZFR5cGVIAFIMcmVwZWF0ZWRUeXBlQg4KDHNlYWxlZF92YWx1ZUoECAEQAkoECAMQBEoECAQQBUoECAUQB
  koECAYQB0oECAsQDEoECAwQDUoECA8QEEoECBAQESKsAQoHVHlwZVJlZhI8CgZwcmVmaXgYASABKAsyJC5zY2FsYS5tZXRhLmlud
  GVybmFsLnNlbWFudGljZGIuVHlwZVIGcHJlZml4EhYKBnN5bWJvbBgCIAEoCVIGc3ltYm9sEksKDnR5cGVfYXJndW1lbnRzGAMgA
  ygLMiQuc2NhbGEubWV0YS5pbnRlcm5hbC5zZW1hbnRpY2RiLlR5cGVSDXR5cGVBcmd1bWVudHMiYgoKU2luZ2xlVHlwZRI8CgZwc
  mVmaXgYASABKAsyJC5zY2FsYS5tZXRhLmludGVybmFsLnNlbWFudGljZGIuVHlwZVIGcHJlZml4EhYKBnN5bWJvbBgCIAEoCVIGc
  3ltYm9sIiIKCFRoaXNUeXBlEhYKBnN5bWJvbBgBIAEoCVIGc3ltYm9sImEKCVN1cGVyVHlwZRI8CgZwcmVmaXgYASABKAsyJC5zY
  2FsYS5tZXRhLmludGVybmFsLnNlbWFudGljZGIuVHlwZVIGcHJlZml4EhYKBnN5bWJvbBgCIAEoCVIGc3ltYm9sIlQKDENvbnN0Y
  W50VHlwZRJECghjb25zdGFudBgBIAEoCzIoLnNjYWxhLm1ldGEuaW50ZXJuYWwuc2VtYW50aWNkYi5Db25zdGFudFIIY29uc3Rhb
  nQiTgoQSW50ZXJzZWN0aW9uVHlwZRI6CgV0eXBlcxgBIAMoCzIkLnNjYWxhLm1ldGEuaW50ZXJuYWwuc2VtYW50aWNkYi5UeXBlU
  gV0eXBlcyJHCglVbmlvblR5cGUSOgoFdHlwZXMYASADKAsyJC5zY2FsYS5tZXRhLmludGVybmFsLnNlbWFudGljZGIuVHlwZVIFd
  HlwZXMiRgoIV2l0aFR5cGUSOgoFdHlwZXMYASADKAsyJC5zY2FsYS5tZXRhLmludGVybmFsLnNlbWFudGljZGIuVHlwZVIFdHlwZ
  XMipQEKDlN0cnVjdHVyYWxUeXBlEjYKA3RwZRgEIAEoCzIkLnNjYWxhLm1ldGEuaW50ZXJuYWwuc2VtYW50aWNkYi5UeXBlUgN0c
  GUSSQoMZGVjbGFyYXRpb25zGAUgASgLMiUuc2NhbGEubWV0YS5pbnRlcm5hbC5zZW1hbnRpY2RiLlNjb3BlUgxkZWNsYXJhdGlvb
  nNKBAgBEAJKBAgCEANKBAgDEAQimwEKDUFubm90YXRlZFR5cGUSTAoLYW5ub3RhdGlvbnMYAyADKAsyKi5zY2FsYS5tZXRhLmlud
  GVybmFsLnNlbWFudGljZGIuQW5ub3RhdGlvblILYW5ub3RhdGlvbnMSNgoDdHBlGAEgASgLMiQuc2NhbGEubWV0YS5pbnRlcm5hb
  C5zZW1hbnRpY2RiLlR5cGVSA3RwZUoECAIQAyKaAQoPRXhpc3RlbnRpYWxUeXBlEjYKA3RwZRgBIAEoCzIkLnNjYWxhLm1ldGEua
  W50ZXJuYWwuc2VtYW50aWNkYi5UeXBlUgN0cGUSSQoMZGVjbGFyYXRpb25zGAMgASgLMiUuc2NhbGEubWV0YS5pbnRlcm5hbC5zZ
  W1hbnRpY2RiLlNjb3BlUgxkZWNsYXJhdGlvbnNKBAgCEAMinQEKDVVuaXZlcnNhbFR5cGUSTgoPdHlwZV9wYXJhbWV0ZXJzGAMgA
  SgLMiUuc2NhbGEubWV0YS5pbnRlcm5hbC5zZW1hbnRpY2RiLlNjb3BlUg50eXBlUGFyYW1ldGVycxI2CgN0cGUYAiABKAsyJC5zY
  2FsYS5tZXRhLmludGVybmFsLnNlbWFudGljZGIuVHlwZVIDdHBlSgQIARACIkQKCkJ5TmFtZVR5cGUSNgoDdHBlGAEgASgLMiQuc
  2NhbGEubWV0YS5pbnRlcm5hbC5zZW1hbnRpY2RiLlR5cGVSA3RwZSJGCgxSZXBlYXRlZFR5cGUSNgoDdHBlGAEgASgLMiQuc2Nhb
  GEubWV0YS5pbnRlcm5hbC5zZW1hbnRpY2RiLlR5cGVSA3RwZSLOBwoIQ29uc3RhbnQSUgoMdW5pdENvbnN0YW50GAEgASgLMiwuc
  2NhbGEubWV0YS5pbnRlcm5hbC5zZW1hbnRpY2RiLlVuaXRDb25zdGFudEgAUgx1bml0Q29uc3RhbnQSWwoPYm9vbGVhbkNvbnN0Y
  W50GAIgASgLMi8uc2NhbGEubWV0YS5pbnRlcm5hbC5zZW1hbnRpY2RiLkJvb2xlYW5Db25zdGFudEgAUg9ib29sZWFuQ29uc3Rhb
  nQSUgoMYnl0ZUNvbnN0YW50GAMgASgLMiwuc2NhbGEubWV0YS5pbnRlcm5hbC5zZW1hbnRpY2RiLkJ5dGVDb25zdGFudEgAUgxie
  XRlQ29uc3RhbnQSVQoNc2hvcnRDb25zdGFudBgEIAEoCzItLnNjYWxhLm1ldGEuaW50ZXJuYWwuc2VtYW50aWNkYi5TaG9ydENvb
  nN0YW50SABSDXNob3J0Q29uc3RhbnQSUgoMY2hhckNvbnN0YW50GAUgASgLMiwuc2NhbGEubWV0YS5pbnRlcm5hbC5zZW1hbnRpY
  2RiLkNoYXJDb25zdGFudEgAUgxjaGFyQ29uc3RhbnQSTwoLaW50Q29uc3RhbnQYBiABKAsyKy5zY2FsYS5tZXRhLmludGVybmFsL
  nNlbWFudGljZGIuSW50Q29uc3RhbnRIAFILaW50Q29uc3RhbnQSUgoMbG9uZ0NvbnN0YW50GAcgASgLMiwuc2NhbGEubWV0YS5pb
  nRlcm5hbC5zZW1hbnRpY2RiLkxvbmdDb25zdGFudEgAUgxsb25nQ29uc3RhbnQSVQoNZmxvYXRDb25zdGFudBgIIAEoCzItLnNjY
  WxhLm1ldGEuaW50ZXJuYWwuc2VtYW50aWNkYi5GbG9hdENvbnN0YW50SABSDWZsb2F0Q29uc3RhbnQSWAoOZG91YmxlQ29uc3Rhb
  nQYCSABKAsyLi5zY2FsYS5tZXRhLmludGVybmFsLnNlbWFudGljZGIuRG91YmxlQ29uc3RhbnRIAFIOZG91YmxlQ29uc3RhbnQSW
  AoOc3RyaW5nQ29uc3RhbnQYCiABKAsyLi5zY2FsYS5tZXRhLmludGVybmFsLnNlbWFudGljZGIuU3RyaW5nQ29uc3RhbnRIAFIOc
  3RyaW5nQ29uc3RhbnQSUgoMbnVsbENvbnN0YW50GAsgASgLMiwuc2NhbGEubWV0YS5pbnRlcm5hbC5zZW1hbnRpY2RiLk51bGxDb
  25zdGFudEgAUgxudWxsQ29uc3RhbnRCDgoMc2VhbGVkX3ZhbHVlIg4KDFVuaXRDb25zdGFudCInCg9Cb29sZWFuQ29uc3RhbnQSF
  AoFdmFsdWUYASABKAhSBXZhbHVlIiQKDEJ5dGVDb25zdGFudBIUCgV2YWx1ZRgBIAEoBVIFdmFsdWUiJQoNU2hvcnRDb25zdGFud
  BIUCgV2YWx1ZRgBIAEoBVIFdmFsdWUiJAoMQ2hhckNvbnN0YW50EhQKBXZhbHVlGAEgASgFUgV2YWx1ZSIjCgtJbnRDb25zdGFud
  BIUCgV2YWx1ZRgBIAEoBVIFdmFsdWUiJAoMTG9uZ0NvbnN0YW50EhQKBXZhbHVlGAEgASgDUgV2YWx1ZSIlCg1GbG9hdENvbnN0Y
  W50EhQKBXZhbHVlGAEgASgCUgV2YWx1ZSImCg5Eb3VibGVDb25zdGFudBIUCgV2YWx1ZRgBIAEoAVIFdmFsdWUiJgoOU3RyaW5nQ
  29uc3RhbnQSFAoFdmFsdWUYASABKAlSBXZhbHVlIg4KDE51bGxDb25zdGFudCKDAwoJU2lnbmF0dXJlElgKDmNsYXNzU2lnbmF0d
  XJlGAEgASgLMi4uc2NhbGEubWV0YS5pbnRlcm5hbC5zZW1hbnRpY2RiLkNsYXNzU2lnbmF0dXJlSABSDmNsYXNzU2lnbmF0dXJlE
  lsKD21ldGhvZFNpZ25hdHVyZRgCIAEoCzIvLnNjYWxhLm1ldGEuaW50ZXJuYWwuc2VtYW50aWNkYi5NZXRob2RTaWduYXR1cmVIA
  FIPbWV0aG9kU2lnbmF0dXJlElUKDXR5cGVTaWduYXR1cmUYAyABKAsyLS5zY2FsYS5tZXRhLmludGVybmFsLnNlbWFudGljZGIuV
  HlwZVNpZ25hdHVyZUgAUg10eXBlU2lnbmF0dXJlElgKDnZhbHVlU2lnbmF0dXJlGAQgASgLMi4uc2NhbGEubWV0YS5pbnRlcm5hb
  C5zZW1hbnRpY2RiLlZhbHVlU2lnbmF0dXJlSABSDnZhbHVlU2lnbmF0dXJlQg4KDHNlYWxlZF92YWx1ZSKlAgoOQ2xhc3NTaWduY
  XR1cmUSTgoPdHlwZV9wYXJhbWV0ZXJzGAEgASgLMiUuc2NhbGEubWV0YS5pbnRlcm5hbC5zZW1hbnRpY2RiLlNjb3BlUg50eXBlU
  GFyYW1ldGVycxI+CgdwYXJlbnRzGAIgAygLMiQuc2NhbGEubWV0YS5pbnRlcm5hbC5zZW1hbnRpY2RiLlR5cGVSB3BhcmVudHMSO
  AoEc2VsZhgDIAEoCzIkLnNjYWxhLm1ldGEuaW50ZXJuYWwuc2VtYW50aWNkYi5UeXBlUgRzZWxmEkkKDGRlY2xhcmF0aW9ucxgEI
  AEoCzIlLnNjYWxhLm1ldGEuaW50ZXJuYWwuc2VtYW50aWNkYi5TY29wZVIMZGVjbGFyYXRpb25zIvcBCg9NZXRob2RTaWduYXR1c
  mUSTgoPdHlwZV9wYXJhbWV0ZXJzGAEgASgLMiUuc2NhbGEubWV0YS5pbnRlcm5hbC5zZW1hbnRpY2RiLlNjb3BlUg50eXBlUGFyY
  W1ldGVycxJNCg5wYXJhbWV0ZXJMaXN0cxgCIAMoCzIlLnNjYWxhLm1ldGEuaW50ZXJuYWwuc2VtYW50aWNkYi5TY29wZVIOcGFyY
  W1ldGVyTGlzdHMSRQoLcmV0dXJuX3R5cGUYAyABKAsyJC5zY2FsYS5tZXRhLmludGVybmFsLnNlbWFudGljZGIuVHlwZVIKcmV0d
  XJuVHlwZSLtAQoNVHlwZVNpZ25hdHVyZRJOCg90eXBlX3BhcmFtZXRlcnMYASABKAsyJS5zY2FsYS5tZXRhLmludGVybmFsLnNlb
  WFudGljZGIuU2NvcGVSDnR5cGVQYXJhbWV0ZXJzEkUKC2xvd2VyX2JvdW5kGAIgASgLMiQuc2NhbGEubWV0YS5pbnRlcm5hbC5zZ
  W1hbnRpY2RiLlR5cGVSCmxvd2VyQm91bmQSRQoLdXBwZXJfYm91bmQYAyABKAsyJC5zY2FsYS5tZXRhLmludGVybmFsLnNlbWFud
  GljZGIuVHlwZVIKdXBwZXJCb3VuZCJICg5WYWx1ZVNpZ25hdHVyZRI2CgN0cGUYASABKAsyJC5zY2FsYS5tZXRhLmludGVybmFsL
  nNlbWFudGljZGIuVHlwZVIDdHBlIvkHChFTeW1ib2xJbmZvcm1hdGlvbhIWCgZzeW1ib2wYASABKAlSBnN5bWJvbBJECghsYW5nd
  WFnZRgQIAEoDjIoLnNjYWxhLm1ldGEuaW50ZXJuYWwuc2VtYW50aWNkYi5MYW5ndWFnZVIIbGFuZ3VhZ2USSgoEa2luZBgDIAEoD
  jI2LnNjYWxhLm1ldGEuaW50ZXJuYWwuc2VtYW50aWNkYi5TeW1ib2xJbmZvcm1hdGlvbi5LaW5kUgRraW5kEh4KCnByb3BlcnRpZ
  XMYBCABKAVSCnByb3BlcnRpZXMSEgoEbmFtZRgFIAEoCVIEbmFtZRJHCglzaWduYXR1cmUYESABKAsyKS5zY2FsYS5tZXRhLmlud
  GVybmFsLnNlbWFudGljZGIuU2lnbmF0dXJlUglzaWduYXR1cmUSTAoLYW5ub3RhdGlvbnMYDSADKAsyKi5zY2FsYS5tZXRhLmlud
  GVybmFsLnNlbWFudGljZGIuQW5ub3RhdGlvblILYW5ub3RhdGlvbnMSUwoNYWNjZXNzaWJpbGl0eRgOIAEoCzItLnNjYWxhLm1ld
  GEuaW50ZXJuYWwuc2VtYW50aWNkYi5BY2Nlc3NpYmlsaXR5Ug1hY2Nlc3NpYmlsaXR5Io0CCgRLaW5kEhAKDFVOS05PV05fS0lOR
  BAAEgkKBUxPQ0FMEBMSCQoFRklFTEQQFBIKCgZNRVRIT0QQAxIPCgtDT05TVFJVQ1RPUhAVEgkKBU1BQ1JPEAYSCAoEVFlQRRAHE
  g0KCVBBUkFNRVRFUhAIEhIKDlNFTEZfUEFSQU1FVEVSEBESEgoOVFlQRV9QQVJBTUVURVIQCRIKCgZPQkpFQ1QQChILCgdQQUNLQ
  UdFEAsSEgoOUEFDS0FHRV9PQkpFQ1QQDBIJCgVDTEFTUxANEgkKBVRSQUlUEA4SDQoJSU5URVJGQUNFEBIiBAgBEAEiBAgCEAIiB
  AgEEAQiBAgFEAUiBAgPEA8iBAgQEBAi0wEKCFByb3BlcnR5EhQKEFVOS05PV05fUFJPUEVSVFkQABIMCghBQlNUUkFDVBAEEgkKB
  UZJTkFMEAgSCgoGU0VBTEVEEBASDAoISU1QTElDSVQQIBIICgRMQVpZEEASCQoEQ0FTRRCAARIOCglDT1ZBUklBTlQQgAISEgoNQ
  09OVFJBVkFSSUFOVBCABBIICgNWQUwQgAgSCAoDVkFSEIAQEgsKBlNUQVRJQxCAIBIMCgdQUklNQVJZEIBAEgoKBEVOVU0QgIABI
  gQIARABIgQIAhACSgQIAhADSgQIBhAHSgQIBxAISgQICBAJSgQICRAKSgQIChALSgQICxAMSgQIDBANSgQIDxAQIkQKCkFubm90Y
  XRpb24SNgoDdHBlGAEgASgLMiQuc2NhbGEubWV0YS5pbnRlcm5hbC5zZW1hbnRpY2RiLlR5cGVSA3RwZSKHAgoNQWNjZXNzaWJpb
  Gl0eRJDCgN0YWcYASABKA4yMS5zY2FsYS5tZXRhLmludGVybmFsLnNlbWFudGljZGIuQWNjZXNzaWJpbGl0eS5UYWdSA3RhZxIWC
  gZzeW1ib2wYAiABKAlSBnN5bWJvbCKYAQoDVGFnEhkKFVVOS05PV05fQUNDRVNTSUJJTElUWRAAEgsKB1BSSVZBVEUQARIQCgxQU
  klWQVRFX1RISVMQAhISCg5QUklWQVRFX1dJVEhJThADEg0KCVBST1RFQ1RFRBAEEhIKDlBST1RFQ1RFRF9USElTEAUSFAoQUFJPV
  EVDVEVEX1dJVEhJThAGEgoKBlBVQkxJQxAHIusBChBTeW1ib2xPY2N1cnJlbmNlEjsKBXJhbmdlGAEgASgLMiUuc2NhbGEubWV0Y
  S5pbnRlcm5hbC5zZW1hbnRpY2RiLlJhbmdlUgVyYW5nZRIWCgZzeW1ib2wYAiABKAlSBnN5bWJvbBJJCgRyb2xlGAMgASgOMjUuc
  2NhbGEubWV0YS5pbnRlcm5hbC5zZW1hbnRpY2RiLlN5bWJvbE9jY3VycmVuY2UuUm9sZVIEcm9sZSI3CgRSb2xlEhAKDFVOS05PV
  05fUk9MRRAAEg0KCVJFRkVSRU5DRRABEg4KCkRFRklOSVRJT04QAiKJAgoKRGlhZ25vc3RpYxI7CgVyYW5nZRgBIAEoCzIlLnNjY
  WxhLm1ldGEuaW50ZXJuYWwuc2VtYW50aWNkYi5SYW5nZVIFcmFuZ2USTwoIc2V2ZXJpdHkYAiABKA4yMy5zY2FsYS5tZXRhLmlud
  GVybmFsLnNlbWFudGljZGIuRGlhZ25vc3RpYy5TZXZlcml0eVIIc2V2ZXJpdHkSGAoHbWVzc2FnZRgDIAEoCVIHbWVzc2FnZSJTC
  ghTZXZlcml0eRIUChBVTktOT1dOX1NFVkVSSVRZEAASCQoFRVJST1IQARILCgdXQVJOSU5HEAISDwoLSU5GT1JNQVRJT04QAxIIC
  gRISU5UEAQiggEKCVN5bnRoZXRpYxI7CgVyYW5nZRgBIAEoCzIlLnNjYWxhLm1ldGEuaW50ZXJuYWwuc2VtYW50aWNkYi5SYW5nZ
  VIFcmFuZ2USOAoEdHJlZRgCIAEoCzIkLnNjYWxhLm1ldGEuaW50ZXJuYWwuc2VtYW50aWNkYi5UcmVlUgR0cmVlIqcFCgRUcmVlE
  kkKCWFwcGx5VHJlZRgBIAEoCzIpLnNjYWxhLm1ldGEuaW50ZXJuYWwuc2VtYW50aWNkYi5BcHBseVRyZWVIAFIJYXBwbHlUcmVlE
  lIKDGZ1bmN0aW9uVHJlZRgCIAEoCzIsLnNjYWxhLm1ldGEuaW50ZXJuYWwuc2VtYW50aWNkYi5GdW5jdGlvblRyZWVIAFIMZnVuY
  3Rpb25UcmVlEkAKBmlkVHJlZRgDIAEoCzImLnNjYWxhLm1ldGEuaW50ZXJuYWwuc2VtYW50aWNkYi5JZFRyZWVIAFIGaWRUcmVlE
  k8KC2xpdGVyYWxUcmVlGAQgASgLMisuc2NhbGEubWV0YS5pbnRlcm5hbC5zZW1hbnRpY2RiLkxpdGVyYWxUcmVlSABSC2xpdGVyY
  WxUcmVlEmQKEm1hY3JvRXhwYW5zaW9uVHJlZRgFIAEoCzIyLnNjYWxhLm1ldGEuaW50ZXJuYWwuc2VtYW50aWNkYi5NYWNyb0V4c
  GFuc2lvblRyZWVIAFISbWFjcm9FeHBhbnNpb25UcmVlElIKDG9yaWdpbmFsVHJlZRgGIAEoCzIsLnNjYWxhLm1ldGEuaW50ZXJuY
  Wwuc2VtYW50aWNkYi5PcmlnaW5hbFRyZWVIAFIMb3JpZ2luYWxUcmVlEkwKCnNlbGVjdFRyZWUYByABKAsyKi5zY2FsYS5tZXRhL
  mludGVybmFsLnNlbWFudGljZGIuU2VsZWN0VHJlZUgAUgpzZWxlY3RUcmVlElUKDXR5cGVBcHBseVRyZWUYCCABKAsyLS5zY2FsY
  S5tZXRhLmludGVybmFsLnNlbWFudGljZGIuVHlwZUFwcGx5VHJlZUgAUg10eXBlQXBwbHlUcmVlQg4KDHNlYWxlZF92YWx1ZSJ7C
  glBcHBseVRyZWUSNAoCZm4YASABKAsyJC5zY2FsYS5tZXRhLmludGVybmFsLnNlbWFudGljZGIuVHJlZVICZm4SOAoEYXJncxgCI
  AMoCzIkLnNjYWxhLm1ldGEuaW50ZXJuYWwuc2VtYW50aWNkYi5UcmVlUgRhcmdzIogBCgxGdW5jdGlvblRyZWUSPgoGcGFyYW1zG
  AEgAygLMiYuc2NhbGEubWV0YS5pbnRlcm5hbC5zZW1hbnRpY2RiLklkVHJlZVIGcGFyYW1zEjgKBHRlcm0YAiABKAsyJC5zY2FsY
  S5tZXRhLmludGVybmFsLnNlbWFudGljZGIuVHJlZVIEdGVybSIaCgZJZFRyZWUSEAoDc3ltGAEgASgJUgNzeW0iTQoLTGl0ZXJhb
  FRyZWUSPgoFY29uc3QYASABKAsyKC5zY2FsYS5tZXRhLmludGVybmFsLnNlbWFudGljZGIuQ29uc3RhbnRSBWNvbnN0IkwKEk1hY
  3JvRXhwYW5zaW9uVHJlZRI2CgN0cGUYAiABKAsyJC5zY2FsYS5tZXRhLmludGVybmFsLnNlbWFudGljZGIuVHlwZVIDdHBlIksKD
  E9yaWdpbmFsVHJlZRI7CgVyYW5nZRgBIAEoCzIlLnNjYWxhLm1ldGEuaW50ZXJuYWwuc2VtYW50aWNkYi5SYW5nZVIFcmFuZ2Uif
  goKU2VsZWN0VHJlZRI4CgRxdWFsGAEgASgLMiQuc2NhbGEubWV0YS5pbnRlcm5hbC5zZW1hbnRpY2RiLlRyZWVSBHF1YWwSNgoCa
  WQYAiABKAsyJi5zY2FsYS5tZXRhLmludGVybmFsLnNlbWFudGljZGIuSWRUcmVlUgJpZCKBAQoNVHlwZUFwcGx5VHJlZRI0CgJmb
  hgBIAEoCzIkLnNjYWxhLm1ldGEuaW50ZXJuYWwuc2VtYW50aWNkYi5UcmVlUgJmbhI6CgV0YXJncxgCIAMoCzIkLnNjYWxhLm1ld
  GEuaW50ZXJuYWwuc2VtYW50aWNkYi5UeXBlUgV0YXJncyo2CgZTY2hlbWESCgoGTEVHQUNZEAASDwoLU0VNQU5USUNEQjMQAxIPC
  gtTRU1BTlRJQ0RCNBAEKjUKCExhbmd1YWdlEhQKEFVOS05PV05fTEFOR1VBR0UQABIJCgVTQ0FMQRABEggKBEpBVkEQAmIGcHJvd
  G8z"""
      ).mkString)
  lazy val scalaDescriptor: _root_.scalapb.descriptors.FileDescriptor = {
    val scalaProto = com.google.protobuf.descriptor.FileDescriptorProto.parseFrom(ProtoBytes)
    _root_.scalapb.descriptors.FileDescriptor.buildFrom(scalaProto, dependencies.map(_.scalaDescriptor))
  }
  lazy val javaDescriptor: com.google.protobuf.Descriptors.FileDescriptor = {
    val javaProto = com.google.protobuf.DescriptorProtos.FileDescriptorProto.parseFrom(ProtoBytes)
    com.google.protobuf.Descriptors.FileDescriptor.buildFrom(javaProto, Array(
    ))
  }
  @deprecated("Use javaDescriptor instead. In a future version this will refer to scalaDescriptor.", "ScalaPB 0.5.47")
  def descriptor: com.google.protobuf.Descriptors.FileDescriptor = javaDescriptor
}