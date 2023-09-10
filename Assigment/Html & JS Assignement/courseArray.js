function showCourses(...courses) {
    const coursesWithA = [];
    
    courses.forEach(course => {
      if (course.includes('a')) {
        coursesWithA.push(course);
      }
    });
    
    return coursesWithA;
  }
  
  const result = showCourses('Java', 'HTML', 'Javascript', 'Spring');
  console.log(result);
  