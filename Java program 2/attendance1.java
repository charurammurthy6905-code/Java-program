class attendance1{
public static void main(String[] args) {
 int[] attendance = {1, 0, 1, 1, 0, 1, 1};
 int present = 0;
 int absent = 0;
 for (int a : attendance) {
if (a == 1) {
present++;
 } else {
 absent++;
            }
        }
double percentage = (present * 100.0) / attendance.length;
System.out.println("Total Present: " + present);
System.out.println("Total Absent: " + absent);
System.out.println("Attendance Percentage: " + percentage + "%");
    }
}