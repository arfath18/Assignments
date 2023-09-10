function empdetails(ename, city, salary) {
    console.log(`Welcome ${ename} from ${city}`);
    
    function bonus(bonusAmount) {
      const newSalary = salary + bonusAmount;
      console.log(`Your salary is ${newSalary}`);
    }
  
    return bonus;
  }
  
  const employeeBonus = empdetails('Arfath', 'Banglore', 50000);
  employeeBonus(2000); 
  