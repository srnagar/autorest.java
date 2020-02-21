package com.azure.autorest.mapper;

import com.azure.autorest.extension.base.model.codemodel.BinarySchema;
import com.azure.autorest.model.clientmodel.ClassType;
import com.azure.autorest.model.clientmodel.IType;

public class BinaryMapper implements IMapper<BinarySchema, IType> {

  private static BinaryMapper instance = new BinaryMapper();

  public static BinaryMapper getInstance() {
    return instance;
  }

  @Override
  public IType map(BinarySchema binarySchema) {
    return ClassType.ByteBuffer;
  }
}
