import java.util.ArrayList;
import java.util.List;

public class Combinaciones{
        public void calculaCaminosVariables(List<Integer> values, ArrayList<Integer> arrayList, int positions){
                //inicialitzacio
                ArrayList<Integer> index = new ArrayList<Integer>();
                for (int i = 0; i < positions; i++){
                        index.add(0);
                        arrayList.add(values.get(0));
                }
                boolean finished = false;
                while (!finished){
                        for (int i = 0; i < positions; i++){
                                arrayList.set(i,values.get(index.get(i)));
                        }
                        System.out.println(arrayList);
                        //augmentem amb 1
                        for (int i = positions-1; i >= 0; i--){
                                index.set(i, index.get(i) + 1);
                                if (index.get(i) != values.size()){
                                        break;
                                }else{
                                        index.set(i,0);
                                        if (i == 0) {
                                                finished = true;
                                        }
                                }
                        }//end for
                }//end while
        }
}
