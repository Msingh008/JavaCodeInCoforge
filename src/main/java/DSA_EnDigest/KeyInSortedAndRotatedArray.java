package DSA_EnDigest;

public class KeyInSortedAndRotatedArray {

    public int getPivot(int [] input){
        int l=0;
        int r=input.length-1;
        while (l!=r){
            int mid=(l+r)/2;
          if(input[mid]>input[mid+1]){
              return  mid;
          }  else if(input[mid-1]>input[mid]){
              return mid-1;
          }else if(input[mid]>input[l]){
              l=mid+1;
          }else {
              r=mid-1;
          }
        }
        return -1;
    }
    public int bSearchOfNumber(int [] inputArr,int left,int right,int key){
        while(left<=right){
            int mid=(left+right)/2;
            if(inputArr[mid]==key){
                return mid;
            }else if(inputArr[mid]>key){
                right=mid-1;
            } else if (inputArr[mid]<key) {
                left=mid+1;
            }
        }
     return -1;
    }
    public int getIndexOfkey(int [] numbers,int key){
        int pivot=getPivot(numbers);
        int keyIdex= bSearchOfNumber(numbers,0,pivot,key);
        if(keyIdex!=-1){
           return keyIdex;
       }
       if(keyIdex==-1){
         keyIdex=  bSearchOfNumber(numbers,pivot+1,numbers.length-1,key);
           if(keyIdex!=-1){
               return keyIdex;
           }

       }
    return -1;
    }

    public static void main(String[] args) {
        KeyInSortedAndRotatedArray kai=new KeyInSortedAndRotatedArray();
        int keyId= kai.getIndexOfkey(new int []{4,6,7,8,10,10,10,1,2,3},10);
        System.out.println(keyId);
    }
}
