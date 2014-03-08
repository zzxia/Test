class Test{
    public static void main(String args[]){
          //数组的静态定义法
          int arr[]={5,2,8,2,4};   //arr[0]=5  arr[1]=2 
          arr[3]=10;
          System.out.println("arr的数组长度是--"+arr.length);
          for (int i=0;i<arr.length;i++){
              System.out.println(arr[i]);
          } 
          //数组的动态声明法
          int arr1 []=new int [10];//char arrChar[]=new char[10];

          //二维数组的定义方法
          int arr2[][]={{1,2,3},{4,5,6},{7,8}}; //5=arr2[1][1]
          System.out.println(arr2[1][1]);
          for (int i=0;i<arr2.length;i++){
               for (int j=0;j<arr2[i].length;j++){
                   System.out.println(arr2[i][j]);
               }
          }
          //二维动态定义   数组长度的声明后，后面不能再改了
          int arr3[][]=new int[3][5];
    }
}
