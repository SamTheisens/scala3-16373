package reactivemongo.api.collections

import collections.GenericCollection
import reactivemongo.api.SerializationPack





trait GenericCollectionWithCommands[P <: SerializationPack] {
  self: GenericCollection[P] =>

}
