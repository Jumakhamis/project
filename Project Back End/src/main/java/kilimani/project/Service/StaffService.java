package kilimani.project.Service;

import kilimani.project.Model.Staff;

import java.util.List;

public interface StaffService {
   public Staff savestaff(Staff staff);

   public List<Staff> fetchStaffList();

   public Staff fetchStaffById(Long staffId);

  public void delectStaffById(Long staffId);

   public Staff updateStaff(Long staffId, Staff staff);
}
