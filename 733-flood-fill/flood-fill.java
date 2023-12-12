class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        cool(image, sr, sc, color, image[sr][sc]);
        return image;
    }


    public int[][] cool(int[][] image, int sr, int sc, int color, int de) {
        if(sr < 0 || sr > image.length - 1) return image;
        if(sc < 0 || sc > image[sr].length - 1) return image;
        if(image[sr][sc] != de || image[sr][sc] == color) return image;
        image[sr][sc] = color;
        cool(image, sr + 1, sc, color, de);
        cool(image, sr - 1, sc, color, de);
        cool(image, sr, sc + 1, color, de);
        cool(image, sr, sc - 1, color, de);
        return image;
    }
}
