package day04;
import java.io.File;
import java.lang.management.ManagementFactory;
import com.sun.management.OperatingSystemMXBean;

public class MemoryCpuDiskspace {
    
    public static void main(String[] args) {
        OperatingSystemMXBean osBean = ManagementFactory.getPlatformMXBean(OperatingSystemMXBean.class);
        long totalPhysicalMemory = osBean.getTotalMemorySize();
        long freePhysicalMemory = osBean.getFreeMemorySize();
        long usedPhysicalMemory = totalPhysicalMemory - freePhysicalMemory;

        // cpu
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        double cpuUsage = osBean.getProcessCpuLoad() * 100;

        // disk space
        File disk = new File("/");
        long totalDiskSpace = disk.getTotalSpace();
        long usableDiskSpace = disk.getUsableSpace();
        long usedDiskSpace = totalDiskSpace - usableDiskSpace;

        System.out.println("Memory Information");
        System.out.println("Total: " + formatSize(totalPhysicalMemory));
        System.out.println("Free: " + formatSize(freePhysicalMemory));
        System.out.println("Used: " + formatSize(usedPhysicalMemory));
        System.out.println();
        System.out.println("CPU Usage: " + String.format("%.2f", cpuUsage) + "%");
        System.out.println();
        System.out.println("Disk Information");
        System.out.println("Total: " + formatSize(totalDiskSpace));
        System.out.println("Usable: " + formatSize(usableDiskSpace));
        System.out.println("Used: " + formatSize(usedDiskSpace));


    }

    private static String formatSize(long bytes) {
        double kb = bytes / 1024.0;
        double mb = kb / 1024.0;
        double gb = mb / 1024.0;

        if (gb >= 1) {
            return String.format("%.2f GB", gb);
        } else if (mb >= 1) {
            return String.format("%.2f MB", mb);
        } else if (kb >= 1) {
            return String.format("%.2f KB", kb);
        } else {
            return bytes + "bytes";
        }
    }
}
