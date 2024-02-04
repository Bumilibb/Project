import java.util.ArrayList;
import java.util.List;

public class NumProccessService {
    private List<NumProccess> numProccesses = new ArrayList<NumProccess>();

    public List<NumProccess> getAllNumProccesses() {
        return numProccesses;
    }

    public NumProccess getNumProccess(int id) {
        for (NumProccess numProccess : numProccesses) {
            if (numProccess.getId() == id) {
                return numProccess;
            }
        }
        return null;
    }

    public void addNumProccess(NumProccess numProccess) {
        numProccesses.add(numProccess);
    }

    public void updateNumProccess(NumProccess numProccess) {
        for (int i = 0; i < numProccesses.size(); i++) {
            NumProccess p = numProccesses.get(i);
            if (p.getId() == numProccess.getId()) {
                numProccesses.set(i, numProccess);
                return;
            }
        }
    }

    public void deleteNumProccess(int id) {
        numProccesses.removeIf(p -> p.getId() == id);
    }
}