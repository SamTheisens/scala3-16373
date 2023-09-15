package collections

import reactivemongo.api.PackSupport
import reactivemongo.api.SerializationPack
import reactivemongo.api.collections.GenericCollectionWithCommands

trait GenericCollection[P <: SerializationPack]
    extends GenericCollectionWithCommands[P]
    with PackSupport[P] {
  self =>
  private implicit def packIdentityWriter
      : pack.Writer[pack.Document] =
    pack.IdentityWriter
}
