package reactivemongo.api


trait SerializationPack extends SerializationPackCompat {
  self: Singleton =>
  type Value
  type Document <: Value
  type Writer[A]
  type Reader[A]
}
