// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: openrtist.proto

package edu.cmu.cs.openrtist;

public final class Protos {
  private Protos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EngineFieldsOrBuilder extends
      // @@protoc_insertion_point(interface_extends:openrtist.EngineFields)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string style = 1;</code>
     */
    java.lang.String getStyle();
    /**
     * <code>string style = 1;</code>
     */
    com.google.protobuf.ByteString
        getStyleBytes();

    /**
     * <code>map&lt;string, string&gt; style_list = 2;</code>
     */
    int getStyleListCount();
    /**
     * <code>map&lt;string, string&gt; style_list = 2;</code>
     */
    boolean containsStyleList(
        java.lang.String key);
    /**
     * Use {@link #getStyleListMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.lang.String, java.lang.String>
    getStyleList();
    /**
     * <code>map&lt;string, string&gt; style_list = 2;</code>
     */
    java.util.Map<java.lang.String, java.lang.String>
    getStyleListMap();
    /**
     * <code>map&lt;string, string&gt; style_list = 2;</code>
     */

    java.lang.String getStyleListOrDefault(
        java.lang.String key,
        java.lang.String defaultValue);
    /**
     * <code>map&lt;string, string&gt; style_list = 2;</code>
     */

    java.lang.String getStyleListOrThrow(
        java.lang.String key);

    /**
     * <code>bytes style_image = 3;</code>
     */
    com.google.protobuf.ByteString getStyleImage();
  }
  /**
   * Protobuf type {@code openrtist.EngineFields}
   */
  public  static final class EngineFields extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:openrtist.EngineFields)
      EngineFieldsOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EngineFields.newBuilder() to construct.
    private EngineFields(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EngineFields() {
      style_ = "";
      styleImage_ = com.google.protobuf.ByteString.EMPTY;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private EngineFields(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              style_ = s;
              break;
            }
            case 18: {
              if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                styleList_ = com.google.protobuf.MapField.newMapField(
                    StyleListDefaultEntryHolder.defaultEntry);
                mutable_bitField0_ |= 0x00000002;
              }
              com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
              styleList__ = input.readMessage(
                  StyleListDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              styleList_.getMutableMap().put(
                  styleList__.getKey(), styleList__.getValue());
              break;
            }
            case 26: {

              styleImage_ = input.readBytes();
              break;
            }
            default: {
              if (!parseUnknownFieldProto3(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return edu.cmu.cs.openrtist.Protos.internal_static_openrtist_EngineFields_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @java.lang.Override
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 2:
          return internalGetStyleList();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return edu.cmu.cs.openrtist.Protos.internal_static_openrtist_EngineFields_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              edu.cmu.cs.openrtist.Protos.EngineFields.class, edu.cmu.cs.openrtist.Protos.EngineFields.Builder.class);
    }

    private int bitField0_;
    public static final int STYLE_FIELD_NUMBER = 1;
    private volatile java.lang.Object style_;
    /**
     * <code>string style = 1;</code>
     */
    public java.lang.String getStyle() {
      java.lang.Object ref = style_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        style_ = s;
        return s;
      }
    }
    /**
     * <code>string style = 1;</code>
     */
    public com.google.protobuf.ByteString
        getStyleBytes() {
      java.lang.Object ref = style_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        style_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int STYLE_LIST_FIELD_NUMBER = 2;
    private static final class StyleListDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<
          java.lang.String, java.lang.String> defaultEntry =
              com.google.protobuf.MapEntry
              .<java.lang.String, java.lang.String>newDefaultInstance(
                  edu.cmu.cs.openrtist.Protos.internal_static_openrtist_EngineFields_StyleListEntry_descriptor, 
                  com.google.protobuf.WireFormat.FieldType.STRING,
                  "",
                  com.google.protobuf.WireFormat.FieldType.STRING,
                  "");
    }
    private com.google.protobuf.MapField<
        java.lang.String, java.lang.String> styleList_;
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
    internalGetStyleList() {
      if (styleList_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            StyleListDefaultEntryHolder.defaultEntry);
      }
      return styleList_;
    }

    public int getStyleListCount() {
      return internalGetStyleList().getMap().size();
    }
    /**
     * <code>map&lt;string, string&gt; style_list = 2;</code>
     */

    public boolean containsStyleList(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      return internalGetStyleList().getMap().containsKey(key);
    }
    /**
     * Use {@link #getStyleListMap()} instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getStyleList() {
      return getStyleListMap();
    }
    /**
     * <code>map&lt;string, string&gt; style_list = 2;</code>
     */

    public java.util.Map<java.lang.String, java.lang.String> getStyleListMap() {
      return internalGetStyleList().getMap();
    }
    /**
     * <code>map&lt;string, string&gt; style_list = 2;</code>
     */

    public java.lang.String getStyleListOrDefault(
        java.lang.String key,
        java.lang.String defaultValue) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetStyleList().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;string, string&gt; style_list = 2;</code>
     */

    public java.lang.String getStyleListOrThrow(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetStyleList().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public static final int STYLE_IMAGE_FIELD_NUMBER = 3;
    private com.google.protobuf.ByteString styleImage_;
    /**
     * <code>bytes style_image = 3;</code>
     */
    public com.google.protobuf.ByteString getStyleImage() {
      return styleImage_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!getStyleBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, style_);
      }
      com.google.protobuf.GeneratedMessageV3
        .serializeStringMapTo(
          output,
          internalGetStyleList(),
          StyleListDefaultEntryHolder.defaultEntry,
          2);
      if (!styleImage_.isEmpty()) {
        output.writeBytes(3, styleImage_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getStyleBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, style_);
      }
      for (java.util.Map.Entry<java.lang.String, java.lang.String> entry
           : internalGetStyleList().getMap().entrySet()) {
        com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
        styleList__ = StyleListDefaultEntryHolder.defaultEntry.newBuilderForType()
            .setKey(entry.getKey())
            .setValue(entry.getValue())
            .build();
        size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(2, styleList__);
      }
      if (!styleImage_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, styleImage_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof edu.cmu.cs.openrtist.Protos.EngineFields)) {
        return super.equals(obj);
      }
      edu.cmu.cs.openrtist.Protos.EngineFields other = (edu.cmu.cs.openrtist.Protos.EngineFields) obj;

      boolean result = true;
      result = result && getStyle()
          .equals(other.getStyle());
      result = result && internalGetStyleList().equals(
          other.internalGetStyleList());
      result = result && getStyleImage()
          .equals(other.getStyleImage());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + STYLE_FIELD_NUMBER;
      hash = (53 * hash) + getStyle().hashCode();
      if (!internalGetStyleList().getMap().isEmpty()) {
        hash = (37 * hash) + STYLE_LIST_FIELD_NUMBER;
        hash = (53 * hash) + internalGetStyleList().hashCode();
      }
      hash = (37 * hash) + STYLE_IMAGE_FIELD_NUMBER;
      hash = (53 * hash) + getStyleImage().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static edu.cmu.cs.openrtist.Protos.EngineFields parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static edu.cmu.cs.openrtist.Protos.EngineFields parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static edu.cmu.cs.openrtist.Protos.EngineFields parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static edu.cmu.cs.openrtist.Protos.EngineFields parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static edu.cmu.cs.openrtist.Protos.EngineFields parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static edu.cmu.cs.openrtist.Protos.EngineFields parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static edu.cmu.cs.openrtist.Protos.EngineFields parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static edu.cmu.cs.openrtist.Protos.EngineFields parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static edu.cmu.cs.openrtist.Protos.EngineFields parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static edu.cmu.cs.openrtist.Protos.EngineFields parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static edu.cmu.cs.openrtist.Protos.EngineFields parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static edu.cmu.cs.openrtist.Protos.EngineFields parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(edu.cmu.cs.openrtist.Protos.EngineFields prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code openrtist.EngineFields}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:openrtist.EngineFields)
        edu.cmu.cs.openrtist.Protos.EngineFieldsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return edu.cmu.cs.openrtist.Protos.internal_static_openrtist_EngineFields_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMapField(
          int number) {
        switch (number) {
          case 2:
            return internalGetStyleList();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMutableMapField(
          int number) {
        switch (number) {
          case 2:
            return internalGetMutableStyleList();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return edu.cmu.cs.openrtist.Protos.internal_static_openrtist_EngineFields_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                edu.cmu.cs.openrtist.Protos.EngineFields.class, edu.cmu.cs.openrtist.Protos.EngineFields.Builder.class);
      }

      // Construct using edu.cmu.cs.openrtist.Protos.EngineFields.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        style_ = "";

        internalGetMutableStyleList().clear();
        styleImage_ = com.google.protobuf.ByteString.EMPTY;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return edu.cmu.cs.openrtist.Protos.internal_static_openrtist_EngineFields_descriptor;
      }

      @java.lang.Override
      public edu.cmu.cs.openrtist.Protos.EngineFields getDefaultInstanceForType() {
        return edu.cmu.cs.openrtist.Protos.EngineFields.getDefaultInstance();
      }

      @java.lang.Override
      public edu.cmu.cs.openrtist.Protos.EngineFields build() {
        edu.cmu.cs.openrtist.Protos.EngineFields result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public edu.cmu.cs.openrtist.Protos.EngineFields buildPartial() {
        edu.cmu.cs.openrtist.Protos.EngineFields result = new edu.cmu.cs.openrtist.Protos.EngineFields(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        result.style_ = style_;
        result.styleList_ = internalGetStyleList();
        result.styleList_.makeImmutable();
        result.styleImage_ = styleImage_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof edu.cmu.cs.openrtist.Protos.EngineFields) {
          return mergeFrom((edu.cmu.cs.openrtist.Protos.EngineFields)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(edu.cmu.cs.openrtist.Protos.EngineFields other) {
        if (other == edu.cmu.cs.openrtist.Protos.EngineFields.getDefaultInstance()) return this;
        if (!other.getStyle().isEmpty()) {
          style_ = other.style_;
          onChanged();
        }
        internalGetMutableStyleList().mergeFrom(
            other.internalGetStyleList());
        if (other.getStyleImage() != com.google.protobuf.ByteString.EMPTY) {
          setStyleImage(other.getStyleImage());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        edu.cmu.cs.openrtist.Protos.EngineFields parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (edu.cmu.cs.openrtist.Protos.EngineFields) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object style_ = "";
      /**
       * <code>string style = 1;</code>
       */
      public java.lang.String getStyle() {
        java.lang.Object ref = style_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          style_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string style = 1;</code>
       */
      public com.google.protobuf.ByteString
          getStyleBytes() {
        java.lang.Object ref = style_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          style_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string style = 1;</code>
       */
      public Builder setStyle(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        style_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string style = 1;</code>
       */
      public Builder clearStyle() {
        
        style_ = getDefaultInstance().getStyle();
        onChanged();
        return this;
      }
      /**
       * <code>string style = 1;</code>
       */
      public Builder setStyleBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        style_ = value;
        onChanged();
        return this;
      }

      private com.google.protobuf.MapField<
          java.lang.String, java.lang.String> styleList_;
      private com.google.protobuf.MapField<java.lang.String, java.lang.String>
      internalGetStyleList() {
        if (styleList_ == null) {
          return com.google.protobuf.MapField.emptyMapField(
              StyleListDefaultEntryHolder.defaultEntry);
        }
        return styleList_;
      }
      private com.google.protobuf.MapField<java.lang.String, java.lang.String>
      internalGetMutableStyleList() {
        onChanged();;
        if (styleList_ == null) {
          styleList_ = com.google.protobuf.MapField.newMapField(
              StyleListDefaultEntryHolder.defaultEntry);
        }
        if (!styleList_.isMutable()) {
          styleList_ = styleList_.copy();
        }
        return styleList_;
      }

      public int getStyleListCount() {
        return internalGetStyleList().getMap().size();
      }
      /**
       * <code>map&lt;string, string&gt; style_list = 2;</code>
       */

      public boolean containsStyleList(
          java.lang.String key) {
        if (key == null) { throw new java.lang.NullPointerException(); }
        return internalGetStyleList().getMap().containsKey(key);
      }
      /**
       * Use {@link #getStyleListMap()} instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.String, java.lang.String> getStyleList() {
        return getStyleListMap();
      }
      /**
       * <code>map&lt;string, string&gt; style_list = 2;</code>
       */

      public java.util.Map<java.lang.String, java.lang.String> getStyleListMap() {
        return internalGetStyleList().getMap();
      }
      /**
       * <code>map&lt;string, string&gt; style_list = 2;</code>
       */

      public java.lang.String getStyleListOrDefault(
          java.lang.String key,
          java.lang.String defaultValue) {
        if (key == null) { throw new java.lang.NullPointerException(); }
        java.util.Map<java.lang.String, java.lang.String> map =
            internalGetStyleList().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       * <code>map&lt;string, string&gt; style_list = 2;</code>
       */

      public java.lang.String getStyleListOrThrow(
          java.lang.String key) {
        if (key == null) { throw new java.lang.NullPointerException(); }
        java.util.Map<java.lang.String, java.lang.String> map =
            internalGetStyleList().getMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }

      public Builder clearStyleList() {
        internalGetMutableStyleList().getMutableMap()
            .clear();
        return this;
      }
      /**
       * <code>map&lt;string, string&gt; style_list = 2;</code>
       */

      public Builder removeStyleList(
          java.lang.String key) {
        if (key == null) { throw new java.lang.NullPointerException(); }
        internalGetMutableStyleList().getMutableMap()
            .remove(key);
        return this;
      }
      /**
       * Use alternate mutation accessors instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.String, java.lang.String>
      getMutableStyleList() {
        return internalGetMutableStyleList().getMutableMap();
      }
      /**
       * <code>map&lt;string, string&gt; style_list = 2;</code>
       */
      public Builder putStyleList(
          java.lang.String key,
          java.lang.String value) {
        if (key == null) { throw new java.lang.NullPointerException(); }
        if (value == null) { throw new java.lang.NullPointerException(); }
        internalGetMutableStyleList().getMutableMap()
            .put(key, value);
        return this;
      }
      /**
       * <code>map&lt;string, string&gt; style_list = 2;</code>
       */

      public Builder putAllStyleList(
          java.util.Map<java.lang.String, java.lang.String> values) {
        internalGetMutableStyleList().getMutableMap()
            .putAll(values);
        return this;
      }

      private com.google.protobuf.ByteString styleImage_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>bytes style_image = 3;</code>
       */
      public com.google.protobuf.ByteString getStyleImage() {
        return styleImage_;
      }
      /**
       * <code>bytes style_image = 3;</code>
       */
      public Builder setStyleImage(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        styleImage_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bytes style_image = 3;</code>
       */
      public Builder clearStyleImage() {
        
        styleImage_ = getDefaultInstance().getStyleImage();
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:openrtist.EngineFields)
    }

    // @@protoc_insertion_point(class_scope:openrtist.EngineFields)
    private static final edu.cmu.cs.openrtist.Protos.EngineFields DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new edu.cmu.cs.openrtist.Protos.EngineFields();
    }

    public static edu.cmu.cs.openrtist.Protos.EngineFields getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EngineFields>
        PARSER = new com.google.protobuf.AbstractParser<EngineFields>() {
      @java.lang.Override
      public EngineFields parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new EngineFields(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<EngineFields> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EngineFields> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public edu.cmu.cs.openrtist.Protos.EngineFields getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_openrtist_EngineFields_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_openrtist_EngineFields_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_openrtist_EngineFields_StyleListEntry_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_openrtist_EngineFields_StyleListEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017openrtist.proto\022\topenrtist\"\240\001\n\014EngineF" +
      "ields\022\r\n\005style\030\001 \001(\t\022:\n\nstyle_list\030\002 \003(\013" +
      "2&.openrtist.EngineFields.StyleListEntry" +
      "\022\023\n\013style_image\030\003 \001(\014\0320\n\016StyleListEntry\022" +
      "\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001B\036\n\024edu.c" +
      "mu.cs.openrtistB\006Protosb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_openrtist_EngineFields_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_openrtist_EngineFields_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_openrtist_EngineFields_descriptor,
        new java.lang.String[] { "Style", "StyleList", "StyleImage", });
    internal_static_openrtist_EngineFields_StyleListEntry_descriptor =
      internal_static_openrtist_EngineFields_descriptor.getNestedTypes().get(0);
    internal_static_openrtist_EngineFields_StyleListEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_openrtist_EngineFields_StyleListEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
