import java.util.ArrayList;

public class K_131_Heapimplementation {
    static class Heap{
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data){
              //add at last
            arr.add(data);
            int x = arr.size()-1;
            int parent = (x-1)/2;

            while(arr.get(x) < arr.get(parent)){
                int temp = arr.get(x);
                arr.set(x, arr.get(parent));
                arr.set(parent,temp);

                x= parent;
                parent = (x-1)/2;
            }

        }

        public int peek(){
            return arr.get(0);
        }
        
        public boolean isEmoty(){
            return arr.size() == 0;
        }
        public int remove(){
            int data = arr.get(0);

            //step 1 --> swap first and last
            int temp = arr.get(0);
            arr.set(0,arr.get(arr.size()-1));
            arr.set(arr.size()-1, temp);

            //step2--> delete
            arr.remove(arr.size()-1);

            //step 3--> heapify
            heapify(0);

            return data;
        }

        private void heapify(int i){
            int left = 2*i+1;
            int right = 2*i+2;
            int minIdx = i;
            //  left/right < arr.size()---->for leaf Node 
            if(left < arr.size() && arr.get(minIdx) > arr.get(left)){
                minIdx = left;
            }
            if(right < arr.size() && arr.get(minIdx) > arr.get(right)){
                minIdx = right;
            }

            if(minIdx != i){
                //swap
                int temp = arr.get(i);
                arr.set(i,arr.get(minIdx));
                arr.set(minIdx,temp);

                heapify(minIdx);
            }
        }
    }
    public static void main(String[] args) {
        Heap hp = new Heap();
        hp.add(5);
        hp.add(1);
        hp.add(3);
        hp.add(7);

        while (!hp.isEmoty()) {
            System.out.println(hp.peek());            
            hp.remove();
        }
    }
}

