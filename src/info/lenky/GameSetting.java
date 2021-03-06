/***************************************************************************
 *   Copyright (C) 2013~2013 by Lenky0401                                  *
 *   Email: lenky0401@gmail.com                                            *
 *   WebSite: http://lenky.info/                                           *
 *                                                                         *
 *   This program is free software; you can redistribute it and/or modify  *
 *   it under the terms of the GNU General Public License as published by  *
 *   the Free Software Foundation; either version 2 of the License, or     *
 *   (at your option) any later version.                                   *
 *                                                                         *
 *   This program is distributed in the hope that it will be useful,       *
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of        *
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the         *
 *   GNU General Public License for more details.                          *
 *                                                                         *
 *   You should have received a copy of the GNU General Public License     *
 *   along with this program; if not, write to the                         *
 *   Free Software Foundation, Inc.,                                       *
 *   51 Franklin St, Fifth Floor, Boston, MA 02110-1301, USA.              *
 ***************************************************************************/

package info.lenky;

import android.graphics.Color;

public class GameSetting {
    public static final int backGroundColor = Color.GRAY;
    //整个手机屏幕被均等的划分为13+2列，其中左13列是游戏地图，右2列用于显示游戏信息
    //所有以(col, row)表示的坐标在屏幕上的像素位置通过各自乘以GameGround.tileScreenWidth和
    //GameGround.tileScreenHeight获得
	public static final int tileCountCol = 13;
    public static final int tileCountGap = 2;
    //整个手机屏幕被均等的划分为10行
	public static final int tileCountRow = 10;
	//用于显示游戏信息的右2列空间外围圆角矩形的圆角角度值
	public static final float rightRoundRectRadiusRat = 5f;
	
	//支持同时2个触点就足够了，一个方向键，一个子弹发射键
	public static final int maxTouchPoint = 2;
	
	//手柄方向盘中心位置
    public static final float joyPadDirectionRow = tileCountRow - 2.6f;
    public static final float joyPadDirectionCol = 2.6f;
    //手柄方向盘四个方向按钮形成的矩形的屏幕宽度（以tileScreen为基本单位）
    public static final float joyPadDirectionScreenGap = 4.8f;
    //手柄方向盘joypaddown.png图像等的像素值
    public static final int joyPadDirectionWidth = 70;
    //手柄方向盘四个方向按钮的屏幕宽度（以tileScreen为基本单位）
    public static final float joyPadDirectionScreen = 1.8f;
    
    //手柄发射器中心位置
	public static final float joyPadFireRow = tileCountRow - 2.6f;
    public static final float joyPadFireCol = tileCountCol + 0.6f;
    //手柄发射器joypadfire.png图像的像素值
    public static final int joyPadFireWidth = 70;
    //手柄发射器按钮的屏幕宽度（以tileScreen为基本单位）
    public static final float joyPadFireScreen = 2.6f;

	//资源图片tile.png内图像得像素值
	public static final int tileWidth = 16;
	//资源图片player1.png和player2.png、enemy.png内坦克图像得像素值
	public static final int tankWidth = 16;
	//资源图片bullet.png内图像得像素值
	public static final int bulletWidth = 6;
	
	//敌方坦克出现的初始位置，按（row×2, col×2）坐标进行定位
    public static final int enemyInitPostion[][] = {{0, 0}, {0, 12}, {0, 24}};
    
    //同时出现敌方坦克数
    public static final int curtMaxEnemy = 5;

    //资源图片tile.png内各个图像的索引
	//NothingIndex表示不在对应位置画图，而直接显示黑色背景
	public static final int NothingIndex = 999;
	//墙外，
    public static final int outerWallIndex = 998;
    //Player1Index表示玩家1
    public static final int Player1Index = 800;
    //Player2Index
    public static final int Player2Index = 801;
    //Enemy坦克
    public static final int EnemyIndex = 700;
	public static final int brickIndex = 0;
	public static final int rockIndex = 1;
	public static final int forestIndex = 2;
	public static final int riverIndex = 3;
	public static final int riverIndex2 = 4;
	public static final int eagleIndex = 5;
	
	//绘画tile全部
	public static final int totalTile = 0;
	//绘画tile的左上部分
	public static final int leftTopQuarterTile = 1;
    //绘画tile的右上部分
	public static final int rightTopQuarterTile = 2;
    //绘画tile的左下部分
	public static final int leftBottomQuarterTile = 3;
    //绘画tile的右下部分
	public static final int rigthBottomQuarterTile = 4;

	//玩家坦克的移动方向，这几个值需要和资源图片
	//player1.png和player2.png内坦克图像的指向一致
	//以及bullet.png内子弹的指向一致，所以在准备资源图片是要注意这一点
    public static final int directionUp = 0;
    public static final int directionRight = 1;
    public static final int directionDown = 2;
    public static final int directionLeft = 3;
    //玩家坦克一次移动的屏幕像素数，四个元素分别代表四个级别
    //即：没有吃星星，吃了1个星星，吃了2个星星，吃了3个星星
    public static final int speedUp[] = {3, 4, 5, 5};
    //玩家坦克子弹速度
    public static final int bulletMultiSpeed = 3;
    
    //按下，弹上，置空
    public static final int actionAnyKeyDown = 1;
    public static final int actionAllKeyUp = 2;
   
}
