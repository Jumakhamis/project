package kilimani.project.Controller;

import kilimani.project.Model.Staff;
import kilimani.project.Service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StaffController {

    @Autowired
    private StaffService staffService;

    @PostMapping("/staff")
    public Staff saveStaff(Staff staff){
        return staffService.savestaff(staff);
    }

    @GetMapping("/staff")
    public List<Staff> fetchStaffList(){
        return staffService.fetchStaffList();
    }

    @GetMapping("/staff/{id}")
    public Staff fetchStaffById(@PathVariable("id") Long staffId){
        return staffService.fetchStaffById(staffId);
    }

    @DeleteMapping("/staff/{id}")
    public String delectStaffById(@PathVariable("id") Long staffId){
        staffService.delectStaffById(staffId);
        return "Staff Delected Succeddfully!!";
    }

    @PutMapping("/staff/{id}/")
    public Staff updateStaff(@PathVariable("id") Long staffId, @RequestBody Staff staff){
        return staffService.updateStaff(staffId, staff);
    }
}
