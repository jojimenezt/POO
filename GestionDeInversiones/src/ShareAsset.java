/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
abstract class  ShareAsset implements Asset{
    protected String symbol;
    protected double totalCost;
    protected double currentPrice;
    
    @Override
    public abstract double getMarketValue();
    //To change body of generated methods, choose Tools | Templates.

    @Override
    public abstract double getProfit();
}
