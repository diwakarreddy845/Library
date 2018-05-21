import { Directive, TemplateRef, ViewContainerRef, Input } from '@angular/core';

@Directive({
  selector: '[appStructure]'
})
export class StructureDirective {
  private hasView = false;
  constructor(private templateRef: TemplateRef<any>, private viewContainer: ViewContainerRef) {


  }


  @Input() set appStructure(condition: boolean) {
    if (!condition && !this.hasView) {
      this.viewContainer.createEmbeddedView(this.templateRef);
      this.hasView = true;
    } else if (condition && this.hasView) {
      this.viewContainer.clear();
      this.hasView = false;
    }
  }

}