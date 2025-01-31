package bubblesort;


public class BubbleSort {

    
    public static void main(String[] args) {
       int nums[] = {5,3,7,6,2};
       int size = nums.length;
       int temp = 0;
       
        System.out.println("Before Sorting");
        for(int num : nums){
            System.out.print(num + " ");
        }
        
//        Loop pertama(Baris kebawah)
        for(int i = 0; i < size; i++){
//            Loop kedua(Baris kesamping)
            for(int j=0;j < size-i-1; j++){
//                Logic
                if(nums[j] > nums[j+1]) {
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            
        }
          System.out.println();
        for(int num : nums){
            System.out.print(num + " ");
        }  
        }
        
            System.out.println();
        System.out.println("After Sorting");
        for(int num : nums){
            System.out.print(num + " ");
        }
        System.out.println();
       
    }
    
    
}
