public class Queue {
    private DynArray data;

    public Queue() {
        data = new DynArray();
    }

    public int size() {
        return data.arraySize();
    }

    public boolean isEmpty() {
        return size() ==0;
    }

    public void que(double value) {
        data.insert(value);
    }

    public double deQue() {
        if (isEmpty()) {
            return Double.NaN;
        }

        double first = data.at(0);
        DynArray temp = new DynArray();

        for (int i=1; i< data.arraySize();i++) {
            temp.insert(data.at(i));;
        }

        data = temp;
        return first;
    }
    public void queueDump() {
        for (int i=0; i< size(); i++) {
            System.out.println("array.at =" +i+ "=" + data.at(i));
        }
    }
}
