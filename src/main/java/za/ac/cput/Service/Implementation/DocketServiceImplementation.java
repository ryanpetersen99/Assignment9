package za.ac.cput.Service.Implementation;

import za.ac.cput.Domain.System.Docket;
import za.ac.cput.Repository.System.DocketRepository;
import za.ac.cput.Repository.Implementation.System.DocketRepositoryImplementation;
import za.ac.cput.Service.System.DocketService;

import java.util.Set;

public class DocketServiceImplementation implements DocketService{

    private static DocketServiceImplementation docketService = null;
    private DocketRepository docketRepository;

    private DocketServiceImplementation(){
        this.docketRepository = DocketRepositoryImplementation.getRepository();
    }

    public static DocketServiceImplementation getDocketService(){
        if(docketService == null)docketService = new DocketServiceImplementation();
        return docketService;
    }

    @Override
    public Docket create(Docket docket) { return this.create(docket);}

    @Override
    public Docket read(String d) { return this.read(d); }

    @Override
    public Docket update(Docket docket) {return this.update(docket);}

    @Override
    public void delete(String d) {this.delete(d);}

    public Set<Docket> getDocketSet() {
        return this.docketRepository.getDocketSet();
    }
}
