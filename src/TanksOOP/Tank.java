package TanksOOP;

public class Tank {
	
	protected int speed = 10;
	
	// 1 - up, 2 - down, 3 - left, 4 - right
	private Direction direction;
	
	// position on BattleField
	private int x;
	private int y;
	
	private ActionField af;
	private BattleField bf;

	
	public Tank(ActionField af, BattleField bf) {
		this(af, bf, 128, 512, Direction.UP);
	}

	public void setDirection(Direction direction) {
		this.direction = direction;
	}

	public Tank(ActionField af, BattleField bf, int x, int y, Direction direction) {
		this.af = af;
		this.bf = bf;
		this.x = x;
		this.y = y;
		this.direction = direction;
	}

	public void turn(Direction direction) throws Exception {
		this.direction = direction;
		af.processTurn(this);

	}

	public void move() throws Exception {
		af.processMove(this);
	}

	public void fire() throws Exception {
		Bullet bullet = new Bullet((x + 25), (y + 25), direction);
		af.processFire(bullet);
	}

	public void moveToQuadrant(int v, int h) throws Exception {
		af.processMoveToQuadrant(v, h);
	}
		
	public void moveRandom() throws Exception {

	}

	public void clean() throws Exception {

	}
	
	public void destroy() {
		x = - 1;
		y = - 1;
	}
	
	public void updateX(int x) {
		this.x += x;
	}

	public void updateY(int y) {
		this.y += y;
	}

	public Direction getDirection() {
		return direction;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getSpeed() {
		return speed;
	}
}

