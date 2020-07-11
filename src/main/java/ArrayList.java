public class ArrayList {

    private Object[] data;
    private int size;
    private int index;

    public ArrayList() {
        this.size = 1;
        this.index = 0;
        this.data = new Object[this.size];
    }

    public void add(Object obj) {
        if(this.index == this.size) {
            doubling();
        }
        data[this.index] = obj;
        this.index++;
    }

    private void doubling() {
        this.size = this.size * 2;
        Object[] newData = new Object[this.size];
        for(int i=0; i<this.data.length; i++) {
            newData[i] = this.data[i];
        }
        this.data = newData;
    }

    public Object get(int index) throws Exception {
        if(index > this.index-1) {
            throw new ArrayIndexOutOfBoundsException();
        } else if (index < 0) {
            throw new Exception("Nagative Value");
        }
        return this.data[index];
    }

    public void remove(int index) throws Exception {
        if(index > this.index-1) {
            throw new ArrayIndexOutOfBoundsException();
        } else if (index < 0) {
            throw new Exception("Nagative Value");
        }
        for(int i = index; i < this.data.length-1; i++) {
            this.data[i] = this.data[i+1];
        }
        this.index--;
    }
}
