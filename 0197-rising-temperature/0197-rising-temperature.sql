# Write your MySQL query statement below
select w.id from weather w join weather t on w.recordDate= date_add(t.recordDate, Interval 1 day)
where w.temperature>t.temperature