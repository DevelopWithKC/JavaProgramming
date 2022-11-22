public class PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets)
    {
        //calculate number of buckets needed to paint the wall and return it
        if(width <= 0 || height <=0 || areaPerBucket <= 0 || extraBuckets < 0)
        {
            return -1;
        }
        return getBucketCount(width, height, areaPerBucket) - extraBuckets;

    }

    public static int getBucketCount(double width, double height, double areaPerBucket)
    {
        //calculate the number of buckets needed to be bought

        if(width <= 0 || height <=0 || areaPerBucket <= 0)
        {
            return -1;
        }
        double areaOfWall = width * height;
        return getBucketCount(areaOfWall, areaPerBucket);

    }

    public static int getBucketCount(double area, double areaPerBucket)
    {
        //number of buckets that is needed to be bought before work
        if(area <= 0 || areaPerBucket <= 0)
        {
            return -1;
        }
        double numberOfBuckets = Math.ceil(area / areaPerBucket);
        return (int)numberOfBuckets;
    }

    public static void main(String[] args) {
        System.out.println(getBucketCount(3.4, 2.1, 1.5));
    }
}
