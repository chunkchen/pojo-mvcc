package com.github.pojomvcc.dummy;

import com.github.pojomvcc.CacheElementFactory;

/**
 * @author Aidan Morgan
 */
public class DummyCacheElementFactory implements CacheElementFactory<DummyCacheElement> {
  public DummyCacheElement createClone(DummyCacheElement ele) {
    DummyCacheElement o = ele;
    DummyCacheElement clone = new DummyCacheElement();
    clone.setValue(o.getValue());

    return clone;
  }

  public DummyCacheElement merge(DummyCacheElement in_repository, DummyCacheElement changes) {
    return changes;
  }
}
