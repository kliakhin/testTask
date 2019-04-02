package test.task;

import javax.inject.Inject;

@Service
public class CalcService {

    @Inject
    private NumberAService numberAService;

    @Inject
    private NumberBService numberBService;

    public Integer calc() {
        return numberAService.getNumber() + numberBService.getNumber();
    }
}
