package test.task;

@Service
public class NumberBService implements NumberService {

    private final Integer number;

    public NumberBService(Integer number) {
        this.number = number;
    }

    public Integer getNumber() {
        return number;
    }
}
