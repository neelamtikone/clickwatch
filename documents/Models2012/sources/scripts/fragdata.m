x = [1.0	3.0	10.0	30.0	100.0	300.0	1000.0	3000.0	10000.0	30000.0	100000.0	300000.0	1000000.0];
y = [14.6	18.0	23.0	43.7	90.0	200.7	504.9	1886.4	4911.6	8477.8	17516.7	36867.7	103485.9; 19.3	24.7	24.4	34.1	60.3	156.0	324.9	1032.3	2977.8	5188.3	11318.1	23026.0	60294.1; 16.2	20.3	20.7	22.1	37.2	75.4	197.0	439.1	1568.5	2793.2	6054.7	14191.9	30543.8; 22.0	34.2	33.6	36.2	41.0	75.3	188.9	474.9	942.8	1780.4	3455.2	7502.5	21078.1; 36.7	62.2	61.5	61.7	65.2	73.5	188.3	404.7	837.1	1270.8	2134.5	5728.2	17645.2; 96.1	165.1	170.7	166.8	175.1	176.3	210.6	383.9	827.7	1224.9	1703.8	4503.1	13323.8; 245.1	413.5	424.1	417.7	440.7	430.5	449.3	532.1	999.4	1365.2	1749.0	3030.4	10553.3; 657.0	1041.5	1038.7	1324.8	1042.4	1104.7	1070.7	1169.9	1376.4	1696.0	2157.6	3327.6	7180.4; 1092.7	1797.1	1776.0	1812.6	1778.7	1807.9	1820.8	1867.1	2001.5	2156.1	2678.7	3704.3	7668.4; 1338.7	2258.8	2183.5	2168.2	2465.6	2190.9	2208.9	2253.1	2397.1	2828.5	2713.7	3935.7	7488.6];
z = [10.0 10.0 100.0 1000.0 10000.0 100000.0];


close all;
%p = loglog(x,y(2,:),'-sr', x,y(4,:),'-vb', x,y(6,:),'-dg', x,y(8,:),'-^k', x,y(10,:),'-<c');
%set(p, 'LineWidth', 1);
%xlabel('Number of loaded objects');
%ylabel('Execution time (ms)');
%l = legend(p, num2str(z', '%-u'),'Location','Best');
%t = get(l, 'title');
%set(t,'string','Fragment size');

colormap(jet(8));
p = loglog(x,y(2,:)-y(2,:)*2,'-s',x,y(2,:),'-s', x,y(4,:),'-v', x,y(6,:),'-d', x,y(8,:),'-^', x,y(10,:),'-<');
%p = loglog(loads, times(1,:),'->', loads, times(2,:),'-s', loads, times(3,:),'-v', loads, times(4,:),'-d', loads, times(5,:),'-^', loads, times(6,:),'-<', loads, times(7,:),'-o');
set(p, 'LineWidth', 1);
xlabel('Number of loaded objects [l]');
ylabel('Execution time [t] (in ms)');
l = legend(p, num2str(z', '%-.0e'),'Location','Best');
t = get(l, 'title');
set(t,'string','Fragment size [f]'); 
ylim([1, 6.4e5]);
%axis tight;
exportfig(gcf, 'measureTimes.eps', 'LineStyleMap', [], 'Color', 'rgb');