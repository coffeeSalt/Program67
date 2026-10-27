public class Stack {
    private DynArray data;

    public Stack() {
        data = new DynArray();
    }

    public int size() {
        return data.arraySize();
    }

    public boolean isEmpty() {
        return size()==0;
    }

    public void push(double value) {
        data.insert(value);
    }

    public double pop() {
        if (isEmpty()) {
            return Double.NaN;
        }

        return data.remove();
    }

    public void stackDump() {
        for(int i= size() -1; i>=0; i--){
            System.out.println(data.at(i));
        }
    }
}
