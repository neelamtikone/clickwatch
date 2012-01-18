close all;

LOC_ar = 4,3 / 1,8;
LOC_am = 4,3 / 1,5;

apl = 59860931 / 11173227;
apm = apl / 2;
mpa = 0.8;

% measurement: 59860931 AST nodes in 16589 C files with 11173227

LOC = [ 1.8 3.4 5.9 11.4];
years = [ (1999 + 1/12)  (2001 + 11/12)  (2003 + 11/12) (2011 + 11/12)];

% LOC_a / LOC_r = LOC_ar
% dLOC = LOC[x] - LOC[x-1]
% dLOC = LOC_a - LOC_r
% 
% LOC_a = LOC_ar*LOC_r
% dLOC = LOC_r(LOC_ar - 1)
%
% LOC_r = dLOC/(LOC_ar-1)
% LOC_a = LOC_ar*dLOC/(LOC_ar-1)

sum_LOC = 0;
r_LOC = 1:length(LOC); % prealloc
for i=1:length(LOC)
   if (i == 1) 
      LOC_y = 0;
   else
      LOC_y = LOC(i-1);
   end
   LOC_x = LOC(i);
   dLOC = LOC_x - LOC_y;
   LOC_r = dLOC/(LOC_ar-1);
   LOC_a = LOC_ar*dLOC/(LOC_ar-1);
    
   sum_LOC = sum_LOC + (LOC_a)*apl*mpa + (LOC_a / LOC_am)*apl*mpa;
   r_LOC(i) = sum_LOC;
end

plot(years, r_LOC);
hold on
plot(years, LOC);