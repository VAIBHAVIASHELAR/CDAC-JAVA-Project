import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SecLoginSuccessComponent } from './sec-login-success.component';

describe('SecLoginSuccessComponent', () => {
  let component: SecLoginSuccessComponent;
  let fixture: ComponentFixture<SecLoginSuccessComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SecLoginSuccessComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(SecLoginSuccessComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
