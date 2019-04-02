package test.task;

@Service
public class NumberAService implements NumberService {

    private final Integer number;

    public NumberAService(Integer number) {
        this.number = number;
    }

    public Integer getNumber() {
        return number;
    }
}
