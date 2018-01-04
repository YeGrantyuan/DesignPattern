package MediatorPattern.Design;

public abstract class AbstractColleague {
	protected AbstractMediator mediator;
	
	public AbstractColleague(AbstractMediator _mediator){
		this.mediator = _mediator;
	}
}
