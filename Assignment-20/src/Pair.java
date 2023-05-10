/*
(Generic Class Pair) 
Write a generic class Pair which has two type parameters—F and S—each 
representing the type of the first and second element of the pair, respectively. 
Add get and set methods for the first and second elements of the pair. 
[Hint: The class header should be public class Pair<F, S>.]
*/
public class Pair<F, S> {
    private F first; //first member of pair
    private S second; //second member of pair

    public Pair(F first, S second) {
        this.first = first;
        this.second = second;
    }

    public void setFirst(F first) {
        this.first = first;
    }

    public void setSecond(S second) {
        this.second = second;
    }

    public F getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }

    public static void main(String[] args) throws Exception {
        Pair<Integer, Integer> pair = new Pair<>(111, 1111);

        System.out.println(pair.getFirst() + " " + pair.getSecond());
    }
}