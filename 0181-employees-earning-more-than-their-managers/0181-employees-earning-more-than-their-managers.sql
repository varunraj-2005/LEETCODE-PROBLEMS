# Write your MySQL query statement below
select e.name as "Employee" from Employee e join Employee a on e.managerId = a.id where e.salary > a.salary;