import java.util.ArrayList;
import java.util.LinkedList;

public class K_140_Hashmapimplementation {
    static class  HashMap<K,V>{
        private class Node{
            K key;
            V value;
            public Node(K key, V value){
                this.key=key;
                this.value=value;
            }
        }
        private int n; //n
        private int N;
        // private int arr[];----->somthing like this
        private LinkedList<Node> bukets[]; //N

        @SuppressWarnings("unchecked")
        public HashMap(){
            this.N=4;
            this.bukets = new LinkedList[4];
            for(int i=0; i<4; i++){
                this.bukets[i] = new LinkedList<>();
            }
        }

        private int hashfuntion(K key){
            int hc = key.hashCode();
            return Math.abs(hc) % N;
        }

        private int searchInLinkedList(K key, int bi){
            LinkedList<Node> ll = bukets[bi];
            int di = 0;
            for(int i=0; i<ll.size();i++){
                Node node = ll.get(i);
                if(node.key == key){
                    return di;
                }
                di++;
            }
            return -1;
        }

        @SuppressWarnings("unchecked")
        private void rehash(){
            LinkedList<Node> oldbuk[] = bukets;
            bukets = new LinkedList[N*2];
            N=2*N;

            for(int i=0; i<bukets.length; i++){
                bukets[i] = new LinkedList<>();
            }

            //nodes -> add in bukets
            for(int i=0; i<oldbuk.length;i++){
                LinkedList<Node> ll = oldbuk[i];
                for(int j=0; j<ll.size(); j++){
                    Node node = ll.remove();
                    put(node.key, node.value);
                }
            }
        }

        public void put(K key, V value){ //O(lamda)
            // bi = backetsIndex
            int bi = hashfuntion(key);
            //di = dataIndex;
            int di = searchInLinkedList(key, bi); //valid , -1

            if(di != -1){
                Node node = bukets[bi].get(di);
                node.value = value;
            }else{
                bukets[bi].add(new Node(key, value));
                n++;
            }

            double lamda = (double)n/N;
            if(lamda > 2.0){
                rehash();
            }
        }

        public boolean containsKey(K key){ //O(1)
            int bi = hashfuntion(key);
            int di = searchInLinkedList(key, bi);
            if(di != -1){
                return true;
            }else{
                return false;
            }
        }

        public V get(K key){//O(1)
            int bi = hashfuntion(key);
            int di = searchInLinkedList(key, bi);
            if(di != -1){
                Node node = bukets[bi].get(di);
                return node.value;
            }else{
                return null;
            }
        }

        public V remove(K key){//O(1)
            int bi = hashfuntion(key);
            int di = searchInLinkedList(key, bi);
            if(di != -1){
                Node node = bukets[bi].remove(di);
                n--;
                return node.value;
            }else{
                return null;
            }
        }

        public ArrayList<K> keySet(){
            ArrayList<K> keys = new ArrayList<>();

            for(int i=0; i<bukets.length;i++){
                LinkedList<Node> ll = bukets[i];
                for (Node node : ll) {
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public boolean isEmpty(){
            return n==0;
        }
    }
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("india",100);
        hm.put("india", 100);
        hm.put("China", 150);
        hm.put("US", 10);
        hm.put("Nepal", 20);

        ArrayList<String> keys = hm.keySet();
        for(String key : keys){
            System.out.println(key);
        }

        System.out.println(hm.get("india"));
        System.out.println(hm.remove("india"));
        System.out.println(hm.get("india"));
    }
}