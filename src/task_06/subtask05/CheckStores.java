package task_06.subtask05;

class CheckStores {

    boolean canBuy(boolean[] shopsOpenStatus) {

        for (boolean actualShopOpen: shopsOpenStatus) {
            if (!actualShopOpen)
                return false;
        }

        return true;

    }

}
