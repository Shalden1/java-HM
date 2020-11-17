package HomeWork4;

import java.util.Arrays;
import java.util.Comparator;

public class DataContainer <T>{
    private T[] data;

    public DataContainer (T[] data){
        this.data = data;
    }

    public int add (T item) {
        if (item == null) {
            return -1;
        }else {
            for (int i = 0; i < data.length; i++) {
                if (data[i] == null) {
                    data[i] = item;
                    return i;
                }
            }
            int x = 0;
            data = Arrays.copyOf(data, data.length + 1);
            return add(item);
        }
    }

    public T get(int index){
        if (index < 0 || index >= data.length){
            return null;
        }
        else {
            return data[index];
        }
    }
    public T[] getItems(){
        return data;
    }

    public boolean delete (int index){
        if (index < 0 || index >= data.length){
            return false;
        }
        else{
            for (int i = index; i < data.length -1; i++){
                data[i] = data [i + 1];
            }
            data = Arrays.copyOf(data, data.length - 1);
        }
        return  true;
    }

    public boolean delete (T item){
        int count = 0;
        for (T del : data){
            if (del.equals(item)){
                delete(count);
                return true;
            }
            count++;
        }
        return false;
    }

    public void sort (Comparator <T> comparator){

    }

    @Override
    public String toString() {
        for (int i = 0; i < data.length; i++){
            delete(null);
        }
        return Arrays.toString(data);
    }
}
