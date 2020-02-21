import { TestBed, async } from '@angular/core/testing';
import { RouterTestingModule } from '@angular/router/testing';
import { AppComponent } from './app.component';

describe('AppComponent', () => {
  beforeEach(async(() => {
    TestBed.configureTestingModule({
      imports: [
        RouterTestingModule
      ],
      declarations: [
        AppComponent
      ],
    }).compileComponents();
  }));

  it('should render title in a h1 tag', async(() => {
    const fixture = TestBed.createComponent(AppComponent);
    fixture.detectChanges();
    const compiled = fixture.debugElement.nativeElement;
    expect(compiled.querySelector('h1').textContent).
    toContain('Welcome to AngTestPractice!');
  }));
  it('should Company Name in a Bold tag', async(() => {
    const fixture = TestBed.createComponent(AppComponent);
    fixture.detectChanges();
    const compiled = fixture.debugElement.nativeElement;
    expect(compiled.querySelector('b').textContent).
    toContain('Hexaware');
  }));

  it(`Should arr1 and arr2 both same`, async(() => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.debugElement.componentInstance;
    expect(app.arr1).toEqual(app.arr2);
  }));
  it(`Should match with Regular expression`, async(() => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.debugElement.componentInstance;
    expect(app.msg).toMatch(/Prasanna/);
    expect(app.msg).toMatch("Angular"); 
    expect(app.msg).not.toMatch(/Ram/);
  }));

  it('should create the app', () => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.debugElement.componentInstance;
    expect(app).toBeTruthy();
  });

  it(`should have as title 'AngTestPractice'`, () => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.debugElement.componentInstance;
    expect(app.title).toEqual('AngTestPractice');
  });
  it(`should have as company 'Hexaware'`, () => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.debugElement.componentInstance;
    expect(app.company).toEqual('Hexaware');
  });

  it(`Should Variable Name to be Defined`, async(() => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.debugElement.componentInstance;
    expect(app.a1.name).toBeDefined();
  }));

  it(`Should Variable Gender to be UnDefined`, async(() => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.debugElement.componentInstance;
    expect(app.a1.gender).not.toBeDefined();
  }));

  it(`Should Stud Should Contain`, async(() => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.debugElement.componentInstance;
    expect(app.Stud).toContain("Himanshu");
    expect(app.Stud).not.toContain("Prasanna");
  }));

  it('should return true from isAuthenticated when there is a token', () => { 
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.debugElement.componentInstance;
    localStorage.setItem('token', '1234'); 
    expect(app.isAuthenticated()).toBeTruthy(); 
  });

  it('Should Returns Service Method (Hexaware) ', () => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.debugElement.componentInstance;
    expect(app.getName()).toEqual("Hexaware");
  });



  it(`Should v1 less than v2`, async(() => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.debugElement.componentInstance;
    expect(app.v1).toBeGreaterThan(app.v2);
  }));


});
