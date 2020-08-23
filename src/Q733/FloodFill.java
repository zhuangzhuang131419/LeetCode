package Q733;

public class FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int[][] status = new int[image.length][image[0].length];
        dfs(image, sr, sc, image[sr][sc], newColor, status);
        return image;
    }

    public void dfs(int[][] image, int stx, int sty, int pixel, int newColor, int[][] status) {
        if (status[stx][sty] != 0) {
            return;
        }
        status[stx][sty] = 1;
        if (image[stx][sty] == pixel) {
            image[stx][sty] = newColor;
        }

        if (stx + 1 < image.length && image[stx + 1][sty] == pixel) {
            dfs(image, stx + 1, sty, pixel, newColor, status);
        }

        if (sty + 1 < image[0].length && image[stx][sty + 1] == pixel) {
            dfs(image, stx, sty + 1, pixel, newColor, status);
        }

        if (stx - 1 >= 0 && image[stx - 1][sty] == pixel) {
            dfs(image, stx - 1, sty, pixel, newColor, status);
        }

        if (sty - 1 >= 0 && image[stx][sty - 1] == pixel) {
            dfs(image, stx, sty - 1, pixel, newColor, status);
        }
        status[stx][sty] = 2;
    }

}
