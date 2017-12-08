package Utils;

import java.util.Stack;

public interface Serializer
{
  void push(Object o);
  Object pop();
  void write() throws Exception;
   void read() throws Exception;
}

  
