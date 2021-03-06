/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Foo {

  public interface Iface {

    public boolean bar(String token) throws Ex1, Ex2, org.apache.thrift.TException;

  }

  public interface AsyncIface {

    public void bar(String token, org.apache.thrift.async.AsyncMethodCallback resultHandler) throws org.apache.thrift.TException;

  }

  public static class Client extends org.apache.thrift.TServiceClient implements Iface {
    public static class Factory implements org.apache.thrift.TServiceClientFactory<Client> {
      public Factory() {}
      public Client getClient(org.apache.thrift.protocol.TProtocol prot) {
        return new Client(prot);
      }
      public Client getClient(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TProtocol oprot) {
        return new Client(iprot, oprot);
      }
    }

    public Client(org.apache.thrift.protocol.TProtocol prot)
    {
      super(prot, prot);
    }

    public Client(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TProtocol oprot) {
      super(iprot, oprot);
    }

    public boolean bar(String token) throws Ex1, Ex2, org.apache.thrift.TException
    {
      send_bar(token);
      return recv_bar();
    }

    public void send_bar(String token) throws org.apache.thrift.TException
    {
      bar_args args = new bar_args();
      args.setToken(token);
      sendBase("bar", args);
    }

    public boolean recv_bar() throws Ex1, Ex2, org.apache.thrift.TException
    {
      bar_result result = new bar_result();
      receiveBase(result, "bar");
      if (result.isSetSuccess()) {
        return result.success;
      }
      if (result.ex1 != null) {
        throw result.ex1;
      }
      if (result.ex2 != null) {
        throw result.ex2;
      }
      throw new org.apache.thrift.TApplicationException(org.apache.thrift.TApplicationException.MISSING_RESULT, "bar failed: unknown result");
    }

  }
  public static class AsyncClient extends org.apache.thrift.async.TAsyncClient implements AsyncIface {
    public static class Factory implements org.apache.thrift.async.TAsyncClientFactory<AsyncClient> {
      private org.apache.thrift.async.TAsyncClientManager clientManager;
      private org.apache.thrift.protocol.TProtocolFactory protocolFactory;
      public Factory(org.apache.thrift.async.TAsyncClientManager clientManager, org.apache.thrift.protocol.TProtocolFactory protocolFactory) {
        this.clientManager = clientManager;
        this.protocolFactory = protocolFactory;
      }
      public AsyncClient getAsyncClient(org.apache.thrift.transport.TNonblockingTransport transport) {
        return new AsyncClient(protocolFactory, clientManager, transport);
      }
    }

    public AsyncClient(org.apache.thrift.protocol.TProtocolFactory protocolFactory, org.apache.thrift.async.TAsyncClientManager clientManager, org.apache.thrift.transport.TNonblockingTransport transport) {
      super(protocolFactory, clientManager, transport);
    }

    public void bar(String token, org.apache.thrift.async.AsyncMethodCallback resultHandler) throws org.apache.thrift.TException {
      checkReady();
      bar_call method_call = new bar_call(token, resultHandler, this, ___protocolFactory, ___transport);
      this.___currentMethod = method_call;
      ___manager.call(method_call);
    }

    public static class bar_call extends org.apache.thrift.async.TAsyncMethodCall {
      private String token;
      public bar_call(String token, org.apache.thrift.async.AsyncMethodCallback resultHandler, org.apache.thrift.async.TAsyncClient client, org.apache.thrift.protocol.TProtocolFactory protocolFactory, org.apache.thrift.transport.TNonblockingTransport transport) throws org.apache.thrift.TException {
        super(client, protocolFactory, transport, resultHandler, false);
        this.token = token;
      }

      public void write_args(org.apache.thrift.protocol.TProtocol prot) throws org.apache.thrift.TException {
        prot.writeMessageBegin(new org.apache.thrift.protocol.TMessage("bar", org.apache.thrift.protocol.TMessageType.CALL, 0));
        bar_args args = new bar_args();
        args.setToken(token);
        args.write(prot);
        prot.writeMessageEnd();
      }

      public boolean getResult() throws Ex1, Ex2, org.apache.thrift.TException {
        if (getState() != org.apache.thrift.async.TAsyncMethodCall.State.RESPONSE_READ) {
          throw new IllegalStateException("Method call not finished!");
        }
        org.apache.thrift.transport.TMemoryInputTransport memoryTransport = new org.apache.thrift.transport.TMemoryInputTransport(getFrameBuffer().array());
        org.apache.thrift.protocol.TProtocol prot = client.getProtocolFactory().getProtocol(memoryTransport);
        return (new Client(prot)).recv_bar();
      }
    }

  }

  public static class Processor<I extends Iface> extends org.apache.thrift.TBaseProcessor<I> implements org.apache.thrift.TProcessor {
    private static final Logger LOGGER = LoggerFactory.getLogger(Processor.class.getName());
    public Processor(I iface) {
      super(iface, getProcessMap(new HashMap<String, org.apache.thrift.ProcessFunction<I, ? extends org.apache.thrift.TBase>>()));
    }

    protected Processor(I iface, Map<String,  org.apache.thrift.ProcessFunction<I, ? extends  org.apache.thrift.TBase>> processMap) {
      super(iface, getProcessMap(processMap));
    }

    private static <I extends Iface> Map<String,  org.apache.thrift.ProcessFunction<I, ? extends  org.apache.thrift.TBase>> getProcessMap(Map<String,  org.apache.thrift.ProcessFunction<I, ? extends  org.apache.thrift.TBase>> processMap) {
      processMap.put("bar", new bar());
      return processMap;
    }

    public static class bar<I extends Iface> extends org.apache.thrift.ProcessFunction<I, bar_args> {
      public bar() {
        super("bar");
      }

      public bar_args getEmptyArgsInstance() {
        return new bar_args();
      }

      protected boolean isOneway() {
        return false;
      }

      public bar_result getResult(I iface, bar_args args) throws org.apache.thrift.TException {
        bar_result result = new bar_result();
        try {
          result.success = iface.bar(args.token);
          result.setSuccessIsSet(true);
        } catch (Ex1 ex1) {
          result.ex1 = ex1;
        } catch (Ex2 ex2) {
          result.ex2 = ex2;
        }
        return result;
      }
    }

  }

  public static class AsyncProcessor<I extends AsyncIface> extends org.apache.thrift.TBaseAsyncProcessor<I> {
    private static final Logger LOGGER = LoggerFactory.getLogger(AsyncProcessor.class.getName());
    public AsyncProcessor(I iface) {
      super(iface, getProcessMap(new HashMap<String, org.apache.thrift.AsyncProcessFunction<I, ? extends org.apache.thrift.TBase, ?>>()));
    }

    protected AsyncProcessor(I iface, Map<String,  org.apache.thrift.AsyncProcessFunction<I, ? extends  org.apache.thrift.TBase, ?>> processMap) {
      super(iface, getProcessMap(processMap));
    }

    private static <I extends AsyncIface> Map<String,  org.apache.thrift.AsyncProcessFunction<I, ? extends  org.apache.thrift.TBase,?>> getProcessMap(Map<String,  org.apache.thrift.AsyncProcessFunction<I, ? extends  org.apache.thrift.TBase, ?>> processMap) {
      processMap.put("bar", new bar());
      return processMap;
    }

    public static class bar<I extends AsyncIface> extends org.apache.thrift.AsyncProcessFunction<I, bar_args, Boolean> {
      public bar() {
        super("bar");
      }

      public bar_args getEmptyArgsInstance() {
        return new bar_args();
      }

      public AsyncMethodCallback<Boolean> getResultHandler(final AsyncFrameBuffer fb, final int seqid) {
        final org.apache.thrift.AsyncProcessFunction fcall = this;
        return new AsyncMethodCallback<Boolean>() { 
          public void onComplete(Boolean o) {
            bar_result result = new bar_result();
            result.success = o;
            result.setSuccessIsSet(true);
            try {
              fcall.sendResponse(fb,result, org.apache.thrift.protocol.TMessageType.REPLY,seqid);
              return;
            } catch (Exception e) {
              LOGGER.error("Exception writing to internal frame buffer", e);
            }
            fb.close();
          }
          public void onError(Exception e) {
            byte msgType = org.apache.thrift.protocol.TMessageType.REPLY;
            org.apache.thrift.TBase msg;
            bar_result result = new bar_result();
            if (e instanceof Ex1) {
                        result.ex1 = (Ex1) e;
                        result.setEx1IsSet(true);
                        msg = result;
            }
            else             if (e instanceof Ex2) {
                        result.ex2 = (Ex2) e;
                        result.setEx2IsSet(true);
                        msg = result;
            }
             else 
            {
              msgType = org.apache.thrift.protocol.TMessageType.EXCEPTION;
              msg = (org.apache.thrift.TBase)new org.apache.thrift.TApplicationException(org.apache.thrift.TApplicationException.INTERNAL_ERROR, e.getMessage());
            }
            try {
              fcall.sendResponse(fb,msg,msgType,seqid);
              return;
            } catch (Exception ex) {
              LOGGER.error("Exception writing to internal frame buffer", ex);
            }
            fb.close();
          }
        };
      }

      protected boolean isOneway() {
        return false;
      }

      public void start(I iface, bar_args args, org.apache.thrift.async.AsyncMethodCallback<Boolean> resultHandler) throws TException {
        iface.bar(args.token,resultHandler);
      }
    }

  }

  public static class bar_args implements org.apache.thrift.TBase<bar_args, bar_args._Fields>, java.io.Serializable, Cloneable, Comparable<bar_args>   {
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("bar_args");

    private static final org.apache.thrift.protocol.TField TOKEN_FIELD_DESC = new org.apache.thrift.protocol.TField("token", org.apache.thrift.protocol.TType.STRING, (short)1);

    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
    static {
      schemes.put(StandardScheme.class, new bar_argsStandardSchemeFactory());
      schemes.put(TupleScheme.class, new bar_argsTupleSchemeFactory());
    }

    public String token; // required

    /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
    public enum _Fields implements org.apache.thrift.TFieldIdEnum {
      TOKEN((short)1, "token");

      private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

      static {
        for (_Fields field : EnumSet.allOf(_Fields.class)) {
          byName.put(field.getFieldName(), field);
        }
      }

      /**
       * Find the _Fields constant that matches fieldId, or null if its not found.
       */
      public static _Fields findByThriftId(int fieldId) {
        switch(fieldId) {
          case 1: // TOKEN
            return TOKEN;
          default:
            return null;
        }
      }

      /**
       * Find the _Fields constant that matches fieldId, throwing an exception
       * if it is not found.
       */
      public static _Fields findByThriftIdOrThrow(int fieldId) {
        _Fields fields = findByThriftId(fieldId);
        if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
        return fields;
      }

      /**
       * Find the _Fields constant that matches name, or null if its not found.
       */
      public static _Fields findByName(String name) {
        return byName.get(name);
      }

      private final short _thriftId;
      private final String _fieldName;

      _Fields(short thriftId, String fieldName) {
        _thriftId = thriftId;
        _fieldName = fieldName;
      }

      public short getThriftFieldId() {
        return _thriftId;
      }

      public String getFieldName() {
        return _fieldName;
      }
    }

    // isset id assignments
    public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
    static {
      Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
      tmpMap.put(_Fields.TOKEN, new org.apache.thrift.meta_data.FieldMetaData("token", org.apache.thrift.TFieldRequirementType.DEFAULT, 
          new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
      metaDataMap = Collections.unmodifiableMap(tmpMap);
      org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(bar_args.class, metaDataMap);
    }

    public bar_args() {
    }

    public bar_args(
      String token)
    {
      this();
      this.token = token;
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public bar_args(bar_args other) {
      if (other.isSetToken()) {
        this.token = other.token;
      }
    }

    public bar_args deepCopy() {
      return new bar_args(this);
    }

    @Override
    public void clear() {
      this.token = null;
    }

    public String getToken() {
      return this.token;
    }

    public bar_args setToken(String token) {
      this.token = token;
      return this;
    }

    public void unsetToken() {
      this.token = null;
    }

    /** Returns true if field token is set (has been assigned a value) and false otherwise */
    public boolean isSetToken() {
      return this.token != null;
    }

    public void setTokenIsSet(boolean value) {
      if (!value) {
        this.token = null;
      }
    }

    public void setFieldValue(_Fields field, Object value) {
      switch (field) {
      case TOKEN:
        if (value == null) {
          unsetToken();
        } else {
          setToken((String)value);
        }
        break;

      }
    }

    public Object getFieldValue(_Fields field) {
      switch (field) {
      case TOKEN:
        return getToken();

      }
      throw new IllegalStateException();
    }

    /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
    public boolean isSet(_Fields field) {
      if (field == null) {
        throw new IllegalArgumentException();
      }

      switch (field) {
      case TOKEN:
        return isSetToken();
      }
      throw new IllegalStateException();
    }

    @Override
    public boolean equals(Object that) {
      if (that == null)
        return false;
      if (that instanceof bar_args)
        return this.equals((bar_args)that);
      return false;
    }

    public boolean equals(bar_args that) {
      if (that == null)
        return false;

      boolean this_present_token = true && this.isSetToken();
      boolean that_present_token = true && that.isSetToken();
      if (this_present_token || that_present_token) {
        if (!(this_present_token && that_present_token))
          return false;
        if (!this.token.equals(that.token))
          return false;
      }

      return true;
    }

    @Override
    public int hashCode() {
      return 0;
    }

    @Override
    public int compareTo(bar_args other) {
      if (!getClass().equals(other.getClass())) {
        return getClass().getName().compareTo(other.getClass().getName());
      }

      int lastComparison = 0;

      lastComparison = Boolean.valueOf(isSetToken()).compareTo(other.isSetToken());
      if (lastComparison != 0) {
        return lastComparison;
      }
      if (isSetToken()) {
        lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.token, other.token);
        if (lastComparison != 0) {
          return lastComparison;
        }
      }
      return 0;
    }

    public _Fields fieldForId(int fieldId) {
      return _Fields.findByThriftId(fieldId);
    }

    public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
      schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
      schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder("bar_args(");
      boolean first = true;

      sb.append("token:");
      if (this.token == null) {
        sb.append("null");
      } else {
        sb.append(this.token);
      }
      first = false;
      sb.append(")");
      return sb.toString();
    }

    public void validate() throws org.apache.thrift.TException {
      // check for required fields
      // check for sub-struct validity
    }

    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
      try {
        write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
      } catch (org.apache.thrift.TException te) {
        throw new java.io.IOException(te);
      }
    }

    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
      try {
        read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
      } catch (org.apache.thrift.TException te) {
        throw new java.io.IOException(te);
      }
    }

    private static class bar_argsStandardSchemeFactory implements SchemeFactory {
      public bar_argsStandardScheme getScheme() {
        return new bar_argsStandardScheme();
      }
    }

    private static class bar_argsStandardScheme extends StandardScheme<bar_args> {

      public void read(org.apache.thrift.protocol.TProtocol iprot, bar_args struct) throws org.apache.thrift.TException {
        org.apache.thrift.protocol.TField schemeField;
        iprot.readStructBegin();
        while (true)
        {
          schemeField = iprot.readFieldBegin();
          if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
            break;
          }
          switch (schemeField.id) {
            case 1: // TOKEN
              if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                struct.token = iprot.readString();
                struct.setTokenIsSet(true);
              } else { 
                org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
              }
              break;
            default:
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
          }
          iprot.readFieldEnd();
        }
        iprot.readStructEnd();

        // check for required fields of primitive type, which can't be checked in the validate method
        struct.validate();
      }

      public void write(org.apache.thrift.protocol.TProtocol oprot, bar_args struct) throws org.apache.thrift.TException {
        struct.validate();

        oprot.writeStructBegin(STRUCT_DESC);
        if (struct.token != null) {
          oprot.writeFieldBegin(TOKEN_FIELD_DESC);
          oprot.writeString(struct.token);
          oprot.writeFieldEnd();
        }
        oprot.writeFieldStop();
        oprot.writeStructEnd();
      }

    }

    private static class bar_argsTupleSchemeFactory implements SchemeFactory {
      public bar_argsTupleScheme getScheme() {
        return new bar_argsTupleScheme();
      }
    }

    private static class bar_argsTupleScheme extends TupleScheme<bar_args> {

      @Override
      public void write(org.apache.thrift.protocol.TProtocol prot, bar_args struct) throws org.apache.thrift.TException {
        TTupleProtocol oprot = (TTupleProtocol) prot;
        BitSet optionals = new BitSet();
        if (struct.isSetToken()) {
          optionals.set(0);
        }
        oprot.writeBitSet(optionals, 1);
        if (struct.isSetToken()) {
          oprot.writeString(struct.token);
        }
      }

      @Override
      public void read(org.apache.thrift.protocol.TProtocol prot, bar_args struct) throws org.apache.thrift.TException {
        TTupleProtocol iprot = (TTupleProtocol) prot;
        BitSet incoming = iprot.readBitSet(1);
        if (incoming.get(0)) {
          struct.token = iprot.readString();
          struct.setTokenIsSet(true);
        }
      }
    }

  }

  public static class bar_result implements org.apache.thrift.TBase<bar_result, bar_result._Fields>, java.io.Serializable, Cloneable, Comparable<bar_result>   {
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("bar_result");

    private static final org.apache.thrift.protocol.TField SUCCESS_FIELD_DESC = new org.apache.thrift.protocol.TField("success", org.apache.thrift.protocol.TType.BOOL, (short)0);
    private static final org.apache.thrift.protocol.TField EX1_FIELD_DESC = new org.apache.thrift.protocol.TField("ex1", org.apache.thrift.protocol.TType.STRUCT, (short)1);
    private static final org.apache.thrift.protocol.TField EX2_FIELD_DESC = new org.apache.thrift.protocol.TField("ex2", org.apache.thrift.protocol.TType.STRUCT, (short)2);

    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
    static {
      schemes.put(StandardScheme.class, new bar_resultStandardSchemeFactory());
      schemes.put(TupleScheme.class, new bar_resultTupleSchemeFactory());
    }

    public boolean success; // required
    public Ex1 ex1; // required
    public Ex2 ex2; // required

    /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
    public enum _Fields implements org.apache.thrift.TFieldIdEnum {
      SUCCESS((short)0, "success"),
      EX1((short)1, "ex1"),
      EX2((short)2, "ex2");

      private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

      static {
        for (_Fields field : EnumSet.allOf(_Fields.class)) {
          byName.put(field.getFieldName(), field);
        }
      }

      /**
       * Find the _Fields constant that matches fieldId, or null if its not found.
       */
      public static _Fields findByThriftId(int fieldId) {
        switch(fieldId) {
          case 0: // SUCCESS
            return SUCCESS;
          case 1: // EX1
            return EX1;
          case 2: // EX2
            return EX2;
          default:
            return null;
        }
      }

      /**
       * Find the _Fields constant that matches fieldId, throwing an exception
       * if it is not found.
       */
      public static _Fields findByThriftIdOrThrow(int fieldId) {
        _Fields fields = findByThriftId(fieldId);
        if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
        return fields;
      }

      /**
       * Find the _Fields constant that matches name, or null if its not found.
       */
      public static _Fields findByName(String name) {
        return byName.get(name);
      }

      private final short _thriftId;
      private final String _fieldName;

      _Fields(short thriftId, String fieldName) {
        _thriftId = thriftId;
        _fieldName = fieldName;
      }

      public short getThriftFieldId() {
        return _thriftId;
      }

      public String getFieldName() {
        return _fieldName;
      }
    }

    // isset id assignments
    private static final int __SUCCESS_ISSET_ID = 0;
    private byte __isset_bitfield = 0;
    public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
    static {
      Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
      tmpMap.put(_Fields.SUCCESS, new org.apache.thrift.meta_data.FieldMetaData("success", org.apache.thrift.TFieldRequirementType.DEFAULT, 
          new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
      tmpMap.put(_Fields.EX1, new org.apache.thrift.meta_data.FieldMetaData("ex1", org.apache.thrift.TFieldRequirementType.DEFAULT, 
          new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRUCT)));
      tmpMap.put(_Fields.EX2, new org.apache.thrift.meta_data.FieldMetaData("ex2", org.apache.thrift.TFieldRequirementType.DEFAULT, 
          new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRUCT)));
      metaDataMap = Collections.unmodifiableMap(tmpMap);
      org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(bar_result.class, metaDataMap);
    }

    public bar_result() {
    }

    public bar_result(
      boolean success,
      Ex1 ex1,
      Ex2 ex2)
    {
      this();
      this.success = success;
      setSuccessIsSet(true);
      this.ex1 = ex1;
      this.ex2 = ex2;
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public bar_result(bar_result other) {
      __isset_bitfield = other.__isset_bitfield;
      this.success = other.success;
      if (other.isSetEx1()) {
        this.ex1 = new Ex1(other.ex1);
      }
      if (other.isSetEx2()) {
        this.ex2 = new Ex2(other.ex2);
      }
    }

    public bar_result deepCopy() {
      return new bar_result(this);
    }

    @Override
    public void clear() {
      setSuccessIsSet(false);
      this.success = false;
      this.ex1 = null;
      this.ex2 = null;
    }

    public boolean isSuccess() {
      return this.success;
    }

    public bar_result setSuccess(boolean success) {
      this.success = success;
      setSuccessIsSet(true);
      return this;
    }

    public void unsetSuccess() {
      __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SUCCESS_ISSET_ID);
    }

    /** Returns true if field success is set (has been assigned a value) and false otherwise */
    public boolean isSetSuccess() {
      return EncodingUtils.testBit(__isset_bitfield, __SUCCESS_ISSET_ID);
    }

    public void setSuccessIsSet(boolean value) {
      __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SUCCESS_ISSET_ID, value);
    }

    public Ex1 getEx1() {
      return this.ex1;
    }

    public bar_result setEx1(Ex1 ex1) {
      this.ex1 = ex1;
      return this;
    }

    public void unsetEx1() {
      this.ex1 = null;
    }

    /** Returns true if field ex1 is set (has been assigned a value) and false otherwise */
    public boolean isSetEx1() {
      return this.ex1 != null;
    }

    public void setEx1IsSet(boolean value) {
      if (!value) {
        this.ex1 = null;
      }
    }

    public Ex2 getEx2() {
      return this.ex2;
    }

    public bar_result setEx2(Ex2 ex2) {
      this.ex2 = ex2;
      return this;
    }

    public void unsetEx2() {
      this.ex2 = null;
    }

    /** Returns true if field ex2 is set (has been assigned a value) and false otherwise */
    public boolean isSetEx2() {
      return this.ex2 != null;
    }

    public void setEx2IsSet(boolean value) {
      if (!value) {
        this.ex2 = null;
      }
    }

    public void setFieldValue(_Fields field, Object value) {
      switch (field) {
      case SUCCESS:
        if (value == null) {
          unsetSuccess();
        } else {
          setSuccess((Boolean)value);
        }
        break;

      case EX1:
        if (value == null) {
          unsetEx1();
        } else {
          setEx1((Ex1)value);
        }
        break;

      case EX2:
        if (value == null) {
          unsetEx2();
        } else {
          setEx2((Ex2)value);
        }
        break;

      }
    }

    public Object getFieldValue(_Fields field) {
      switch (field) {
      case SUCCESS:
        return Boolean.valueOf(isSuccess());

      case EX1:
        return getEx1();

      case EX2:
        return getEx2();

      }
      throw new IllegalStateException();
    }

    /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
    public boolean isSet(_Fields field) {
      if (field == null) {
        throw new IllegalArgumentException();
      }

      switch (field) {
      case SUCCESS:
        return isSetSuccess();
      case EX1:
        return isSetEx1();
      case EX2:
        return isSetEx2();
      }
      throw new IllegalStateException();
    }

    @Override
    public boolean equals(Object that) {
      if (that == null)
        return false;
      if (that instanceof bar_result)
        return this.equals((bar_result)that);
      return false;
    }

    public boolean equals(bar_result that) {
      if (that == null)
        return false;

      boolean this_present_success = true;
      boolean that_present_success = true;
      if (this_present_success || that_present_success) {
        if (!(this_present_success && that_present_success))
          return false;
        if (this.success != that.success)
          return false;
      }

      boolean this_present_ex1 = true && this.isSetEx1();
      boolean that_present_ex1 = true && that.isSetEx1();
      if (this_present_ex1 || that_present_ex1) {
        if (!(this_present_ex1 && that_present_ex1))
          return false;
        if (!this.ex1.equals(that.ex1))
          return false;
      }

      boolean this_present_ex2 = true && this.isSetEx2();
      boolean that_present_ex2 = true && that.isSetEx2();
      if (this_present_ex2 || that_present_ex2) {
        if (!(this_present_ex2 && that_present_ex2))
          return false;
        if (!this.ex2.equals(that.ex2))
          return false;
      }

      return true;
    }

    @Override
    public int hashCode() {
      return 0;
    }

    @Override
    public int compareTo(bar_result other) {
      if (!getClass().equals(other.getClass())) {
        return getClass().getName().compareTo(other.getClass().getName());
      }

      int lastComparison = 0;

      lastComparison = Boolean.valueOf(isSetSuccess()).compareTo(other.isSetSuccess());
      if (lastComparison != 0) {
        return lastComparison;
      }
      if (isSetSuccess()) {
        lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.success, other.success);
        if (lastComparison != 0) {
          return lastComparison;
        }
      }
      lastComparison = Boolean.valueOf(isSetEx1()).compareTo(other.isSetEx1());
      if (lastComparison != 0) {
        return lastComparison;
      }
      if (isSetEx1()) {
        lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ex1, other.ex1);
        if (lastComparison != 0) {
          return lastComparison;
        }
      }
      lastComparison = Boolean.valueOf(isSetEx2()).compareTo(other.isSetEx2());
      if (lastComparison != 0) {
        return lastComparison;
      }
      if (isSetEx2()) {
        lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ex2, other.ex2);
        if (lastComparison != 0) {
          return lastComparison;
        }
      }
      return 0;
    }

    public _Fields fieldForId(int fieldId) {
      return _Fields.findByThriftId(fieldId);
    }

    public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
      schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
      schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
      }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder("bar_result(");
      boolean first = true;

      sb.append("success:");
      sb.append(this.success);
      first = false;
      if (!first) sb.append(", ");
      sb.append("ex1:");
      if (this.ex1 == null) {
        sb.append("null");
      } else {
        sb.append(this.ex1);
      }
      first = false;
      if (!first) sb.append(", ");
      sb.append("ex2:");
      if (this.ex2 == null) {
        sb.append("null");
      } else {
        sb.append(this.ex2);
      }
      first = false;
      sb.append(")");
      return sb.toString();
    }

    public void validate() throws org.apache.thrift.TException {
      // check for required fields
      // check for sub-struct validity
    }

    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
      try {
        write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
      } catch (org.apache.thrift.TException te) {
        throw new java.io.IOException(te);
      }
    }

    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
      try {
        // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
        __isset_bitfield = 0;
        read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
      } catch (org.apache.thrift.TException te) {
        throw new java.io.IOException(te);
      }
    }

    private static class bar_resultStandardSchemeFactory implements SchemeFactory {
      public bar_resultStandardScheme getScheme() {
        return new bar_resultStandardScheme();
      }
    }

    private static class bar_resultStandardScheme extends StandardScheme<bar_result> {

      public void read(org.apache.thrift.protocol.TProtocol iprot, bar_result struct) throws org.apache.thrift.TException {
        org.apache.thrift.protocol.TField schemeField;
        iprot.readStructBegin();
        while (true)
        {
          schemeField = iprot.readFieldBegin();
          if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
            break;
          }
          switch (schemeField.id) {
            case 0: // SUCCESS
              if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
                struct.success = iprot.readBool();
                struct.setSuccessIsSet(true);
              } else { 
                org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
              }
              break;
            case 1: // EX1
              if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
                struct.ex1 = new Ex1();
                struct.ex1.read(iprot);
                struct.setEx1IsSet(true);
              } else { 
                org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
              }
              break;
            case 2: // EX2
              if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
                struct.ex2 = new Ex2();
                struct.ex2.read(iprot);
                struct.setEx2IsSet(true);
              } else { 
                org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
              }
              break;
            default:
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
          }
          iprot.readFieldEnd();
        }
        iprot.readStructEnd();

        // check for required fields of primitive type, which can't be checked in the validate method
        struct.validate();
      }

      public void write(org.apache.thrift.protocol.TProtocol oprot, bar_result struct) throws org.apache.thrift.TException {
        struct.validate();

        oprot.writeStructBegin(STRUCT_DESC);
        if (struct.isSetSuccess()) {
          oprot.writeFieldBegin(SUCCESS_FIELD_DESC);
          oprot.writeBool(struct.success);
          oprot.writeFieldEnd();
        }
        if (struct.ex1 != null) {
          oprot.writeFieldBegin(EX1_FIELD_DESC);
          struct.ex1.write(oprot);
          oprot.writeFieldEnd();
        }
        if (struct.ex2 != null) {
          oprot.writeFieldBegin(EX2_FIELD_DESC);
          struct.ex2.write(oprot);
          oprot.writeFieldEnd();
        }
        oprot.writeFieldStop();
        oprot.writeStructEnd();
      }

    }

    private static class bar_resultTupleSchemeFactory implements SchemeFactory {
      public bar_resultTupleScheme getScheme() {
        return new bar_resultTupleScheme();
      }
    }

    private static class bar_resultTupleScheme extends TupleScheme<bar_result> {

      @Override
      public void write(org.apache.thrift.protocol.TProtocol prot, bar_result struct) throws org.apache.thrift.TException {
        TTupleProtocol oprot = (TTupleProtocol) prot;
        BitSet optionals = new BitSet();
        if (struct.isSetSuccess()) {
          optionals.set(0);
        }
        if (struct.isSetEx1()) {
          optionals.set(1);
        }
        if (struct.isSetEx2()) {
          optionals.set(2);
        }
        oprot.writeBitSet(optionals, 3);
        if (struct.isSetSuccess()) {
          oprot.writeBool(struct.success);
        }
        if (struct.isSetEx1()) {
          struct.ex1.write(oprot);
        }
        if (struct.isSetEx2()) {
          struct.ex2.write(oprot);
        }
      }

      @Override
      public void read(org.apache.thrift.protocol.TProtocol prot, bar_result struct) throws org.apache.thrift.TException {
        TTupleProtocol iprot = (TTupleProtocol) prot;
        BitSet incoming = iprot.readBitSet(3);
        if (incoming.get(0)) {
          struct.success = iprot.readBool();
          struct.setSuccessIsSet(true);
        }
        if (incoming.get(1)) {
          struct.ex1 = new Ex1();
          struct.ex1.read(iprot);
          struct.setEx1IsSet(true);
        }
        if (incoming.get(2)) {
          struct.ex2 = new Ex2();
          struct.ex2.read(iprot);
          struct.setEx2IsSet(true);
        }
      }
    }

  }

}
