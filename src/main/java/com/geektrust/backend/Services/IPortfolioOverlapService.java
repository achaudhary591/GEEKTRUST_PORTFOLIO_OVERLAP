package com.geektrust.backend.Services;



public interface IPortfolioOverlapService {
    
    void currentPortfolioStocks(String[] stocks);

    void calculatePortfolioOverlap(String funds);

    void addStocksToFund(String fundName , String stockName);

}
