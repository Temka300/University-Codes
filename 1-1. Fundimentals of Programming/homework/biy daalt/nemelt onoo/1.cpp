#include <iostream>

using namespace std;

int main() {
  int num_courses; // Number of courses
  double gpa, total_gpa = 0; // GPA and total GPA

  // Input the number of courses for the student
  cout << "Enter the number of courses for the student: ";
  cin >> num_courses;

  // Loop through all courses for the student
  for (int i = 1; i <= num_courses; i++) {
    // Input the GPA for the course
    cout << "Enter the GPA for course " << i << ": ";
    cin >> gpa;

    // Add the GPA to the total GPA
    total_gpa += gpa;
  }

  // Calculate the average GPA
  double avg_gpa = total_gpa / num_courses;

  // Print the average GPA
  cout << "Average GPA: " << avg_gpa << endl;

  return 0;
}

