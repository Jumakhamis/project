package kilimani.project.Service;

import kilimani.project.Model.Staff;
import kilimani.project.Repository.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class StaffServiceImpl implements StaffService{

    @Autowired
    private StaffRepository staffRepository;

    @Override
    public Staff savestaff(Staff staff) {
        return staffRepository.save(staff);
    }

    @Override
    public List<Staff> fetchStaffList() {
        return staffRepository.findAll();
    }

    @Override
    public Staff fetchStaffById(Long staffId) {
        return staffRepository.findById(staffId).get();
    }

    @Override
    public void delectStaffById(Long staffId) {
        staffRepository.deleteById(staffId);
    }

    @Override
    public Staff updateStaff(Long staffId, Staff staff) {
        Staff staffDB = staffRepository.findById(staffId).get();

        if(Objects.nonNull(staff.getStaffName()) &&
        !"".equalsIgnoreCase(staff.getStaffName())){
          staffDB.setStaffName(staff.getStaffName());
        }

        if(Objects.nonNull(staff.getStaffEmail()) &&
                !"".equalsIgnoreCase(staff.getStaffEmail())){
            staffDB.setStaffName(staff.getStaffEmail());
        }

        if(Objects.nonNull(staff.getStaffPhoneNo()) &&
                !"".equalsIgnoreCase(staff.getStaffPhoneNo())){
            staffDB.setStaffName(staff.getStaffPhoneNo());
        }

        if(Objects.nonNull(staff.getStaffGender()) &&
                !"".equalsIgnoreCase(staff.getStaffGender())){
            staffDB.setStaffName(staff.getStaffGender());
        }

        return staffRepository.save(staffDB);
    }
}
