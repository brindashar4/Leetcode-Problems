/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class First_Bad_Version_278 extends VersionControl {
    public int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        int mid = start + (end - start) / 2;
        
        while(start < end) {
            mid = start + (end - start) / 2;
            if(isBadVersion(mid) == true) {
                end = mid;
            }
            else {
                start = mid+1;
            }
        }
        return end;
    }
}