public class MyStack {
  char arr[];
  int top;

  public MyStack(int size)
  {
    arr = new char[size];
    top = -1;

  }
  public boolean isEmpty()
  {
    return (top == -1);
  }
  public boolean isFull()
  {
    if(top == arr.length-1)
    {
      return true;
    }
    else
    {
      return false;
    }
  }
  public void push(char value)
  {
    if(isFull())
    {
      return;
    }
    else
    {
      arr[++top]= value;
    }
  }
  public char pop()
  {
    return (arr[top--]);
  }
  public char peek()
  {
    return arr[top];
  }

}
