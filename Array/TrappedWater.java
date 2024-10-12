class TrappedWater {

    public static int trappedwat(int height[]) {
        int n = height.length;

        int leftBoundary[] = new int[n]; // Auxillary Function

        leftBoundary[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftBoundary[i] = Math.max(leftBoundary[i - 1], height[i]);
        }

        int RightBoundary[] = new int[n]; // or helper Fun or Auxillary Function
        RightBoundary[n - 1] = height[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            RightBoundary[i] = Math.max(RightBoundary[i + 1], height[i]);
        }

        int trappedWater = 0;

        int width = 1;
        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(RightBoundary[i], leftBoundary[i]);

            int waterTrappedonEachBar = waterLevel - height[i] * width; // here width is 1

            trappedWater += waterTrappedonEachBar;
        }

        return trappedWater;

    }

    public static void main(String[] args) {
        int bar_Level[] = { 4, 2, 0, 6, 3, 2, 5 };
        int totalTrappedWater = trappedwat(bar_Level);
        System.out.println(+totalTrappedWater);
    }
}